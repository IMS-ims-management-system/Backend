package com.backend.Auth.Service;

import com.backend.Auth.DTO.*;
import com.backend.Auth.Repository.UserRepository;
import com.backend.JwtToken.JwtTokenProvider;
import com.backend.JwtToken.UserDetailsImpl;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    public JwtResponseDTO login(JwtRequestDTO request) throws Exception {
        Authentication authentication = this.authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );
        return createJwtToken(authentication);
    }

    private JwtResponseDTO createJwtToken(Authentication authentication) {
        UserDetailsImpl principal = (UserDetailsImpl) authentication.getPrincipal();
        String token = jwtTokenProvider.generateToken(principal);
        return new JwtResponseDTO(token);
    }

    public boolean signup(SignUpRequestDTO request) {
        // 중복 유저 점검
        boolean existMember = userRepository.existsById(request.getStudentid());

        if (existMember)
            return false;

        User user = new User(request);

        if ("MANAGER".equals(request.getRole())) {
            user.setRole(Role.MANAGER);
        } else if ("USER".equals(request.getRole())) {
            user.setRole(Role.GUEST);
        } else {
            return false;
        }

        user.encryptPassword(passwordEncoder);

        userRepository.save(user);

        return true;
    }

    public User userDetailInfo(String email) {
        return userRepository.findByEmail(email);
    }

    public User updateUser(User updatedMember){

        User updatedInfo = User.builder()
                .email(updatedMember.getEmail())
                .studentid(updatedMember.getStudentid())
                .password(updatedMember.getPassword())
                .name(updatedMember.getName())
                .birth(updatedMember.getBirth())
                .gender(updatedMember.getGender())
                .phone(updatedMember.getPhone())
                .address(updatedMember.getAddress())
                .build();

        return userRepository.save(updatedMember);
    }
}

package com.backend.JwtToken;



import com.backend.Auth.DTO.Role;
import com.backend.Auth.DTO.User;
import com.backend.Auth.Repository.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findById(username)
                .orElseThrow(()-> new UsernameNotFoundException("등록되지 않은 사용자 입니다"));

        boolean isManager = user.getRole() == Role.MANAGER;
        boolean isApproved = user.isApproved(); // 승인 여부

        return new UserDetailsImpl(user, isManager, isApproved);
    }
}

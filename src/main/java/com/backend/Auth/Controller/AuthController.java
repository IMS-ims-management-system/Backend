package com.backend.Auth.Controller;

import com.backend.Auth.DTO.JwtRequestDTO;
import com.backend.Auth.DTO.JwtResponseDTO;
import com.backend.Auth.DTO.SignUpRequestDTO;
import com.backend.Auth.Service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final AuthenticationManager authenticationManager;

    @PostMapping(value = "login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JwtResponseDTO> login(@RequestBody JwtRequestDTO request) {

        try {
            return ResponseEntity.ok().body(authService.login(request));
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().body(new JwtResponseDTO("failed"));
        }

    }

    @PostMapping(value = "signup", produces = MediaType.APPLICATION_JSON_VALUE)
    public String signup(@RequestBody SignUpRequestDTO request) {

        boolean isSignup = authService.signup(request);

        System.out.println(request);

        if (!isSignup)
            return "failed";

        return "success";
    }
}

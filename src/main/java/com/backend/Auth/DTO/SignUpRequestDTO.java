package com.backend.Auth.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestDTO {

    private String role;
    private String studentid;
    private String password;
    private String name;
    private String birth;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String grade;

}

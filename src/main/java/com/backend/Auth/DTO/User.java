package com.backend.Auth.DTO;




import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String email;

    private String password;
    private String studentid;
    private String name;

    private String birth;

    private String gender;

    private String phone;

    private String address;

    private String grade;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Transient
    private boolean approved = false;

    public User(SignUpRequestDTO request) {
        studentid = request.getStudentid();
        email = request.getEmail();
        password = request.getPassword();
        name = request.getName();
        birth = request.getBirth();
        gender = request.getGender();
        phone = request.getPhone();
        address = request.getAddress();
        grade = request.getGrade();
        role = Role.USER; // 회원가입하는 사용자 권한 기본 USER (임시)
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void encryptPassword(PasswordEncoder passwordEncoder) {
        password = passwordEncoder.encode(password);
    }
}

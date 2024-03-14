package com.emreilgar.movieapp.dto;

import com.emreilgar.movieapp.model.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserCreateRequestDto {
    private Long id;
    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String password;
    private UserType userType;
}

package com.tyler.sentinel.dto;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Credentials {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}

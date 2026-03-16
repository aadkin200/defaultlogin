package com.asoftware.prod.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequest {
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 8)
    private String password;
}

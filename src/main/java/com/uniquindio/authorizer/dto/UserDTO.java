package com.uniquindio.authorizer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserDTO(
        @Email
        @NotBlank
        String usuario,
        @NotBlank
        String clave)

{}
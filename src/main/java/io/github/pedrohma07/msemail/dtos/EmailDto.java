package io.github.pedrohma07.msemail.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmailDto(
        @NotBlank
        String ownerRef,
        @NotBlank
        String emailFrom,
        @NotBlank
        @Email
        String emailTo,
        @NotBlank
        String subject,
        @NotBlank
        String text
) {
}

package br.com.luishmalafaia.apimed.address.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDTO(
    @NotBlank
    String street,

    String number,

    String complement,

    @NotBlank
    String neighborhood,

    @NotBlank
    String city,

    @NotBlank
    String uf,

    @NotBlank
    @Pattern(regexp = "\\d{8}")
    String cep
) {}

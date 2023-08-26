package br.com.luishmalafaia.apimed.patient.dto;

import br.com.luishmalafaia.apimed.address.dto.AddressDTO;
import jakarta.validation.constraints.NotNull;

public record UpdatePatientDTO(
        @NotNull
        Long id,
        String name,
        String phone,
        AddressDTO address
) {
}

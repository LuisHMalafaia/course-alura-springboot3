package br.com.luishmalafaia.apimed.medic.dto;

import br.com.luishmalafaia.apimed.address.dto.AddressDTO;
import jakarta.validation.constraints.NotNull;

public record UpdateMedicDTO(
        @NotNull
        Long id,
        String name,
        String phone,
        AddressDTO address
) {
}

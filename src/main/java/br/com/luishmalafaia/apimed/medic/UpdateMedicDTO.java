package br.com.luishmalafaia.apimed.medic;

import br.com.luishmalafaia.apimed.address.AddressDTO;
import jakarta.validation.constraints.NotNull;

public record UpdateMedicDTO(
        @NotNull
        Long id,
        String name,
        String phone,
        AddressDTO address
) {
}

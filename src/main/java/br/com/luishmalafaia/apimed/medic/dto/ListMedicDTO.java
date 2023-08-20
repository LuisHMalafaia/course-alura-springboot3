package br.com.luishmalafaia.apimed.medic.dto;

import br.com.luishmalafaia.apimed.medic.Medic;
import br.com.luishmalafaia.apimed.medic.Specialty;

public record ListMedicDTO(
        Long id,
        String name,
        String email,
        String crm,
        Specialty specialty
) {

    public ListMedicDTO(Medic medic){
        this(medic.getId(), medic.getName(), medic.getEmail(), medic.getCrm(), medic.getSpecialty());
    }

}

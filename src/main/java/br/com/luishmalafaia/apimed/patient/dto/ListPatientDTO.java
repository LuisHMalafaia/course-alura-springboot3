package br.com.luishmalafaia.apimed.patient.dto;

import br.com.luishmalafaia.apimed.patient.Patient;

public record ListPatientDTO(
        String name,
        String email,
        String cpf
) {

    public ListPatientDTO (Patient patient){
        this(patient.getName(), patient.getEmail(), patient.getCpf());
    }

}

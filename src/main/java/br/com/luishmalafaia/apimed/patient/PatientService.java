package br.com.luishmalafaia.apimed.patient;

import br.com.luishmalafaia.apimed.patient.dto.ListPatientDTO;
import br.com.luishmalafaia.apimed.patient.dto.SavePatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;

    public void save(SavePatientDTO data){
        Patient newPatient = new Patient(data);
        this.repository.save(newPatient);
    }

    public Page<ListPatientDTO> findAll(Pageable pageable) {
        return this.repository.findAll(pageable).map(ListPatientDTO::new);
    }
}

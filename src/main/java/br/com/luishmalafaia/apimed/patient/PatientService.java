package br.com.luishmalafaia.apimed.patient;

import br.com.luishmalafaia.apimed.patient.dto.SavePatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;

    public void save(SavePatientDTO data){
        Patient newPatient = new Patient(data);
        this.repository.save(newPatient);
    }

}

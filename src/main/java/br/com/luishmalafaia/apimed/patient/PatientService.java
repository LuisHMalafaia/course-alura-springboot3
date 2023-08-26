package br.com.luishmalafaia.apimed.patient;

import br.com.luishmalafaia.apimed.patient.dto.ListPatientDTO;
import br.com.luishmalafaia.apimed.patient.dto.SavePatientDTO;
import br.com.luishmalafaia.apimed.patient.dto.UpdatePatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;

    public void save(SavePatientDTO data){
        Patient newPatient = new Patient(data);
        this.repository.save(newPatient);
    }

    public Page<ListPatientDTO> findAll(Pageable pageable) {
        return this.repository.findAllByActiveTrue(pageable).map(ListPatientDTO::new);
    }

    public Optional<ListPatientDTO> findAllById(Long id) {
        return this.repository.findByIdAndActiveTrue(id).map(ListPatientDTO::new);
    }

    public void update(UpdatePatientDTO data) {
        var patient = this.repository.getReferenceById(data.id());
        patient.updateData(data);
    }

    public void delete(Long id) {
        var patient = this.repository.getReferenceById(id);
        patient.delete();
    }
}

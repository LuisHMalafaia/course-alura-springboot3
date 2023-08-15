package br.com.luishmalafaia.apimed.medic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicService {
    @Autowired
    private MedicRepository repository;

    public void save(SaveMedicDTO data){
        Medic newMedic = new Medic(data);
        this.repository.save(newMedic);
    }
}

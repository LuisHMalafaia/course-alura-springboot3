package br.com.luishmalafaia.apimed.medic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MedicService {
    @Autowired
    private MedicRepository repository;

    public void save(SaveMedicDTO data){
        Medic newMedic = new Medic(data);
        this.repository.save(newMedic);
    }

    public Page<ListMedicDTO> findAll(Pageable pageable){
        return repository.findAll(pageable).map(ListMedicDTO::new);
    }
}
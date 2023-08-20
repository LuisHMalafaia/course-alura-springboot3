package br.com.luishmalafaia.apimed.medic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicService {
    @Autowired
    private MedicRepository repository;

    public void save(SaveMedicDTO data){
        Medic newMedic = new Medic(data);
        this.repository.save(newMedic);
    }

    public Page<ListMedicDTO> findAll(Pageable pageable){
        return this.repository.findAll(pageable).map(ListMedicDTO::new);
    }

    public Optional<ListMedicDTO> findById(Long id) {
        return this.repository.findById(id).map(ListMedicDTO::new);
    }

    public void update(UpdateMedicDTO data) {
        var medic = repository.getReferenceById(data.id());
        medic.updateData(data);
    }
}
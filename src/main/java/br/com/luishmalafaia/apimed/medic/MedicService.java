package br.com.luishmalafaia.apimed.medic;

import br.com.luishmalafaia.apimed.medic.dto.ListMedicDTO;
import br.com.luishmalafaia.apimed.medic.dto.SaveMedicDTO;
import br.com.luishmalafaia.apimed.medic.dto.UpdateMedicDTO;
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
        return this.repository.findAllByActiveTrue(pageable).map(ListMedicDTO::new);
    }

    public Optional<ListMedicDTO> findById(Long id) {
        return this.repository.findByIdAndActiveTrue(id).map(ListMedicDTO::new);
    }

    public void update(UpdateMedicDTO data) {
        var medic = this.repository.getReferenceById(data.id());
        medic.updateData(data);
    }

    public void delete(Long id) {
        var medic = this.repository.getReferenceById(id);
        medic.delete();
    }
}
package br.com.luishmalafaia.apimed.medic;

import br.com.luishmalafaia.apimed.medic.dto.ListMedicDTO;
import br.com.luishmalafaia.apimed.medic.dto.SaveMedicDTO;
import br.com.luishmalafaia.apimed.medic.dto.UpdateMedicDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/medics")
public class MedicController {

    @Autowired
    private MedicService service;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid SaveMedicDTO data){
        this.service.save(data);
    }

    @GetMapping
    public Page<ListMedicDTO> findAll(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable){
        return this.service.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Optional<ListMedicDTO> findById(@PathVariable Long id){
        return this.service.findById(id);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid UpdateMedicDTO data){
        this.service.update(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        this.service.delete(id);
    }

}

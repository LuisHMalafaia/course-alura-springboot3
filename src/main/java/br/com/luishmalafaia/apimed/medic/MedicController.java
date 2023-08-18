package br.com.luishmalafaia.apimed.medic;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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
        return service.findAll(pageable);
    }

}

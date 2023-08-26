package br.com.luishmalafaia.apimed.patient;

import br.com.luishmalafaia.apimed.patient.dto.ListPatientDTO;
import br.com.luishmalafaia.apimed.patient.dto.SavePatientDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/patients")
public class PatientController {
    @Autowired
    private PatientService service;

    @PostMapping
    public void save(@RequestBody @Valid SavePatientDTO data){
        this.service.save(data);
    }

    @GetMapping
    public Page<ListPatientDTO> findAll(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable){
        return this.service.findAll(pageable);
    }

    @GetMapping("{id}")
    public Optional<ListPatientDTO> findById(@PathVariable Long id){
        return this.service.findAllById(id);
    }

}

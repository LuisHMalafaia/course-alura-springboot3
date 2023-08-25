package br.com.luishmalafaia.apimed.patient;

import br.com.luishmalafaia.apimed.patient.dto.SavePatientDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/patients")
public class PatientController {
    @Autowired
    private PatientService service;

    @PostMapping
    public void save(@RequestBody @Valid SavePatientDTO data){
        this.service.save(data);
    }

}

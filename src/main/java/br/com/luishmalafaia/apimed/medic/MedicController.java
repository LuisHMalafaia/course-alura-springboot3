package br.com.luishmalafaia.apimed.medic;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/medics")
public class MedicController {

    @Autowired
    private MedicService service;

    @PostMapping
    public void save(@RequestBody @Valid SaveMedicDTO data){
        this.service.save(data);
    }

}

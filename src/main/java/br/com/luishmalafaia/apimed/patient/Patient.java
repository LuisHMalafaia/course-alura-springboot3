package br.com.luishmalafaia.apimed.patient;

import br.com.luishmalafaia.apimed.address.Address;
import br.com.luishmalafaia.apimed.patient.dto.SavePatientDTO;
import br.com.luishmalafaia.apimed.patient.dto.UpdatePatientDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "patients")
@Entity(name = "patients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String cpf;
    private Address address;

    private boolean active;

    public Patient(SavePatientDTO data) {
        this.name = data.name();
        this.email = data.email();
        this.phone = data.phone();
        this.cpf = data.cpf();
        this.address = new Address(data.address());
        this.active = true;
    }

    public void updateData(UpdatePatientDTO data) {
        if(data.name() != null){
            this.name = data.name();
        }
        if(data.phone() != null){
            this.phone = data.phone();
        }
        this.address.updateData(data.address());
    }

    public void delete() {
        this.active = false;
    }
}

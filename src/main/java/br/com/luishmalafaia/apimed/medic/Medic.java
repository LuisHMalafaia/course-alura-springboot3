package br.com.luishmalafaia.apimed.medic;

import br.com.luishmalafaia.apimed.address.Address;
import br.com.luishmalafaia.apimed.medic.dto.SaveMedicDTO;
import br.com.luishmalafaia.apimed.medic.dto.UpdateMedicDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "medics")
@Entity(name = "medics")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String crm;
    private Boolean active;

    @Enumerated(value = EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Medic(SaveMedicDTO data) {
        this.name = data.name();
        this.email = data.email();
        this.phone = data.phone();
        this.crm = data.crm();
        this.specialty = data.specialty();
        this.address = new Address(data.address());
        this.active = true;
    }

    public void updateData(UpdateMedicDTO data) {
        if(data.name() != null){
            this.name = data.name();
        }
        if(data.phone() != null){
            this.phone = data.phone();
        }
        if(data.address() != null){
            this.address.updateData(data.address());
        }
    }

    public void delete() {
        this.active = false;
    }
}
package br.com.luishmalafaia.apimed.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String uf; //state
    private String cep;

    public Address(AddressDTO address) {
        this.street = address.street();
        this.number = address.number();
        this.complement = address.complement();
        this.neighborhood = address.neighborhood();
        this.city = address.city();
        this.uf = address.uf();
        this.cep = address.cep();
    }

    public void updateData(AddressDTO data){
        if(data.street() != null){
            this.street = data.street();
        }
        if(data.number() != null){
            this.number = data.number();
        }
        if(data.complement() != null){
            this.complement = data.complement();
        }
        if(data.neighborhood() != null){
            this.neighborhood = data.neighborhood();
        }
        if(data.city() != null){
            this.city = data.city();
        }
        if(data.uf() != null){
            this.uf = data.uf();
        }
        if(data.cep() != null){
            this.cep = data.cep();
        }
    }
}

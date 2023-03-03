package com.example.demo.controller.dto;

import lombok.Setter;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
public class ReserveDTO {
    @Setter @Getter private String owner_name;
    @Setter @Getter private String document;
    @Setter @Getter private String address;
    @Setter @Getter private String pet_name;
    public ReserveDTO(){

    }

    public String toStringUsuario(){

        return "UsuarioDTO{" +
                "owner='" + owner_name + '\'' +
                ", document='" + document + '\'' +
                ", address='" + address + '\'' +
                ", pet_name=" + pet_name +
                '}';
    }
}



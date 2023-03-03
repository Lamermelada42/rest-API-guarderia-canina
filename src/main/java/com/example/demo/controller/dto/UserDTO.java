package com.example.demo.controller.dto;

import lombok.Setter;
import lombok.Data;
import lombok.Getter;

@Data
public class UserDTO {
    @Setter @Getter private String owner_name;
    @Setter @Getter private String document;
    @Setter @Getter private String address;
    @Setter @Getter private String pet_name;
}


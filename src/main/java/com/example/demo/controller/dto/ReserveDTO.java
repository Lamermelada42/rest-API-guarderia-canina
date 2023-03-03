package com.example.demo.controller.dto;

import lombok.Setter;
import lombok.Data;
import lombok.Getter;

@Data
public class ReserveDTO {
    @Setter @Getter private String document;
    @Setter @Getter private String pet_name;
    @Setter @Getter private String reserve_date;
}



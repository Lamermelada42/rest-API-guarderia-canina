package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.controller.dto.ReserveDTO;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
public class ReserveController {

    static List<ReserveDTO> reserves = new ArrayList<>();
    public ReserveController(List<ReserveDTO> reserves){
    }
    @PostMapping(path = "/guarderia/reserva")
    public void saveClient(@RequestBody ReserveDTO reserve) {
        if(reserves.size()<=19){
        reserves.add(reserve);
        }
    }
    @GetMapping(path = "/guarderias/reserva/all")
    public List<ReserveDTO> getAll(){
        return reserves;
    }
    @GetMapping(path = "/guarderias/reserva")
    public List<ReserveDTO> searchByReservedDate(@RequestParam String reserve_date){
        List<ReserveDTO> results = new ArrayList<>();
        for (ReserveDTO reserve : reserves) {
            if (reserve.getReserve_date().equals(reserve_date)) {
                results.add(reserve);
            }
        }
        return results;
    }
    @GetMapping(path = "/guarderias/reservas")
    public List<ReserveDTO> searchByOwnerName(@RequestParam String document){
        List<ReserveDTO> results = new ArrayList<>();
        for (ReserveDTO reserve : reserves) {
            if (reserve.getDocument().equals(document)) {
                results.add(reserve);
            }
        }
        return results;
    }
}

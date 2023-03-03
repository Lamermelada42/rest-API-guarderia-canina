package com.example.demo.controller;

import com.example.demo.controller.dto.UserDTO;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    static List<UserDTO> clients = new ArrayList<>();

    public UserController(List<UserDTO> clients ){
    }

    @PostMapping(path = "/guarderia")
    public void saveClient(@RequestBody UserDTO client) {
        clients.add(client);
    }
    @GetMapping(path = "/guarderias/all")
    public List<UserDTO> getAll(){
       return clients;
    }

}

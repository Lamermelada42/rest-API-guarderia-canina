package com.example.demo.controller;

import com.example.demo.controller.dto.UsuarioDTO;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    static List<UsuarioDTO> clients = new ArrayList<>();

    public UserController(List<String> pets ){
    }
    @GetMapping(path = "/hola")
    public String Saludar(){
        return "hola Mundo";
    }
    @PostMapping(path = "/guarderia")
    public void saveClient(@RequestBody UsuarioDTO client) {
        System.out.println("recibi: " + client);
        clients.add(client);
    }
    /*@GetMapping(path = "/guarderia/{owner_name}")
    public String getClient(@PathVariable int owner_name){

        return clients.get(owner_name);
    }*/

}

package com.example.demo.controller;

import com.example.demo.controller.dto.UserDTO;

import ch.qos.logback.core.net.server.Client;

import org.apache.catalina.User;
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
        System.out.println("recibi: " + client);
        clients.add(client);
    }
    
    @GetMapping(path = "/guarderias")
    public List<UserDTO> searchByOwner(@RequestParam String owner_name) {
        List<UserDTO> results = new ArrayList<>();
        for (UserDTO client : clients) {
            client.getOwner_name();
            results.add(client);
            /*if (client.getOwner_name().equals(owner_name)) {
                results.add(client);
            }*/
        }
        return results;
    }
    @GetMapping(path = "/guarderias/all")
    public List<UserDTO> getAll(){
        return clients;
    }

}

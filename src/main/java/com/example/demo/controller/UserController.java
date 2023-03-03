package com.example.demo.controller;

import com.example.demo.controller.dto.UserDTO;
import org.springframework.web.bind.annotation.*;
import com.example.demo.database.Search;
import com.example.demo.database.Addition;
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
        Addition app = new Addition();
        app.insert(client.getOwner_name(), client.getDocument(), client.getAddress(), client.getPet_name());
        Search application = new Search();
        application.selectClient();

    }
    @GetMapping(path = "/guarderias/all")
    public List<UserDTO> getAll(){
       return clients;
    }

}

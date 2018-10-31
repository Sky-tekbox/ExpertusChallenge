package com.example.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value="/challenge")
@RestController
public class MainController {
    @Autowired
    private ClientService clientService;

    @GetMapping(path="/add")
    public @ResponseBody
    String addNewClient (@RequestParam String firstName, @RequestParam String lastName,@RequestParam String email, @RequestParam String telephone) {
        clientService.saveClient(firstName,lastName,email,telephone);
        return "saved";
    }
}

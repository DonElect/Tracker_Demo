package com.donatus.TrackerDemo.controller;

import com.donatus.TrackerDemo.entity.Client;
import com.donatus.TrackerDemo.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    private final ClientServices services;

    @Autowired
    public ClientController(ClientServices services) {
        this.services = services;
    }

    @GetMapping("/client/register")
    public String registerClient(Model model){
        model.addAttribute("clients", new Client());

        return "registerPage";
    }

    @PostMapping("/client/register")
    public String register(Client newClient){
        services.registerClient(newClient);

        return "redirect:/client/login";
    }

    @GetMapping("/client/login")
    public String login(Model model){
        model.addAttribute("clients", new Client());

        return "loginPage";
    }
}

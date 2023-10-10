package com.donatus.TrackerDemo.test;

import com.donatus.TrackerDemo.entity.Client;
import com.donatus.TrackerDemo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestingThings {
    private ClientRepository repo;

    @Autowired
    public TestingThings(ClientRepository repo) {
        this.repo = repo;
    }


    private void testSave(){
        Client client = new Client();

        client.setName("Village people");
        client.setEmail("village@gmail.com");
        client.setPassword("password");

        repo.save(client);
    }

    @RequestMapping("/test")
    public Client testing(){
        testSave();
        if (repo.findById(1).isEmpty())
            return new Client();

        return repo.findById(1).get();
    }
}

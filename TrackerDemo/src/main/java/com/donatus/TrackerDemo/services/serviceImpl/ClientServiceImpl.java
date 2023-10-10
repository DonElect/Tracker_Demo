package com.donatus.TrackerDemo.services.serviceImpl;

import com.donatus.TrackerDemo.entity.Client;
import com.donatus.TrackerDemo.repository.ClientRepository;
import com.donatus.TrackerDemo.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientServices {

    private final ClientRepository clientRepo;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Client registerClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client login(String email, String password) {
        return clientRepo.findClientByEmailAndPassword(email, password);
    }
}

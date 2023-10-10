package com.donatus.TrackerDemo.services;

import com.donatus.TrackerDemo.entity.Client;
import org.springframework.stereotype.Service;


public interface ClientServices {
    Client registerClient(Client client);
    Client login(String email, String password);
}

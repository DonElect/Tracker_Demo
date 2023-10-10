package com.donatus.TrackerDemo.repository;

import com.donatus.TrackerDemo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findClientByEmailAndPassword(String email, String password);
}

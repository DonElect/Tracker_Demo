package com.donatus.TrackerDemo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String name;

    @Column(length = 25)
    private String email;

    @Column(length = 15)
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = CascadeType.ALL)
    private List<ClientTask> tasks;

    public void addTask(ClientTask task){
        if (tasks == null){
            tasks = new ArrayList<>();
        }

        tasks.add(task);
    }
}

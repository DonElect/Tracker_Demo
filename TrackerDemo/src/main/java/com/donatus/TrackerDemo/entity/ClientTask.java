package com.donatus.TrackerDemo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "client_task")
public class ClientTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;

    private String activity;

    @Column(length = 1000)
    private String activityDetails;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Timestamp dueDate;

    @CreationTimestamp
    private Timestamp createdDate;

    @UpdateTimestamp
    private Timestamp updateDate;

    private Timestamp doneDate;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
                          CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "client_id")
    private Client client;
}

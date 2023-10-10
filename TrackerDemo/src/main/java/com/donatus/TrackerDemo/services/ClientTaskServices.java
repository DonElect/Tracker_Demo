package com.donatus.TrackerDemo.services;

import com.donatus.TrackerDemo.entity.ClientTask;
import com.donatus.TrackerDemo.entity.Status;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientTaskServices {
    ClientTask saveTask(ClientTask task);
    void deleteTask(ClientTask task);

    List<ClientTask> allTask(Integer client_id);
    ClientTask oneTask(Integer client_id, Integer taskId);
    List<ClientTask> taskByStatus(Integer client_id, Status status);
}

package com.donatus.TrackerDemo.services.serviceImpl;

import com.donatus.TrackerDemo.entity.ClientTask;
import com.donatus.TrackerDemo.entity.Status;
import com.donatus.TrackerDemo.repository.ClientTaskRepository;
import com.donatus.TrackerDemo.services.ClientTaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientTaskServicesImpl implements ClientTaskServices {

    private final ClientTaskRepository taskRepository;

    @Autowired
    public ClientTaskServicesImpl(ClientTaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public ClientTask saveTask(ClientTask task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(ClientTask task) {
        taskRepository.delete(task);
    }

    @Override
    public List<ClientTask> allTask(Integer client_id) {
        return taskRepository.findClientTaskByClientId(client_id);
    }

    @Override
    public ClientTask oneTask(Integer client_id, Integer taskId) {
        return taskRepository.findClientTaskByClientIdAndTaskId(client_id, taskId);
    }

    @Override
    public List<ClientTask> taskByStatus(Integer client_id, Status status) {
        return taskRepository.findClientTaskByClientIdAndStatus(client_id, status);
    }
}

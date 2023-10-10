package com.donatus.TrackerDemo.repository;

import com.donatus.TrackerDemo.entity.ClientTask;
import com.donatus.TrackerDemo.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientTaskRepository extends JpaRepository<ClientTask, Integer> {
    List<ClientTask> findClientTaskByClientId(Integer client_id);
    ClientTask findClientTaskByClientIdAndTaskId(Integer client_id, Integer taskId);
    List<ClientTask> findClientTaskByClientIdAndStatus(Integer client_id, Status status);
}

package com.backend.ProjectCalendar.Service;

import com.backend.ProjectCalendar.DTO.TaskDTO;
import com.backend.ProjectCalendar.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskDTO> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<TaskDTO> getTaskById(int taskId) {
        return taskRepository.findById(taskId);
    }

    public TaskDTO createTask(TaskDTO taskDTO) {
        return taskRepository.save(taskDTO);
    }

    public Optional<TaskDTO> updateTask(int taskId, TaskDTO updatedTask) {
        return taskRepository.findById(taskId)
                .map(existingTask -> {
                    existingTask.setTask_name(updatedTask.getTask_name());
                    existingTask.setReader(updatedTask.getReader());
                    existingTask.setState(updatedTask.getState());
                    existingTask.set_checked(updatedTask.is_checked());
                    existingTask.setDead_lind(updatedTask.getDead_lind());
                    return taskRepository.save(existingTask);
                });
    }

    public void deleteTask(int taskId) {
        taskRepository.deleteById(taskId);
    }
}

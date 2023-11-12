package com.backend.ProjectCalendar.Repository;

import com.backend.ProjectCalendar.DTO.TaskDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskDTO,Integer> {

}

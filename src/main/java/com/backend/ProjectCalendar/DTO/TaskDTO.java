package com.backend.ProjectCalendar.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class TaskDTO {
    @Id
    int task_id;
    String task_name;
    String reader;
    String state;
    boolean is_checked;
    Date dead_lind;


}

package com.backend.ProjectCalendar.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TaskDTO {
    int task_id;
    String task_name;
    String reader;
    String state;
    boolean is_checked;
    Date dead_lind;
}

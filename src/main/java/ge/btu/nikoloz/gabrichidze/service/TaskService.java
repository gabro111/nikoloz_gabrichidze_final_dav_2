package ge.btu.nikoloz.gabrichidze.service;

import ge.btu.nikoloz.gabrichidze.dto.AddTaskInput;
import ge.btu.nikoloz.gabrichidze.dto.DeleteTaskInput;
import ge.btu.nikoloz.gabrichidze.dto.GetTasksOutput;

public interface TaskService {
    void addTask(AddTaskInput addTaskInput);
    void deleteTask(DeleteTaskInput deleteTaskInput);
    GetTasksOutput getTasks();

}

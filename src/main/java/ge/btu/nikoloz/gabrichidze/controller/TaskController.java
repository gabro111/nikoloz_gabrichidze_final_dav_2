package ge.btu.nikoloz.gabrichidze.controller;

import ge.btu.nikoloz.gabrichidze.dto.AddTaskInput;
import ge.btu.nikoloz.gabrichidze.dto.DeleteTaskInput;
import ge.btu.nikoloz.gabrichidze.dto.GetTasksOutput;
import ge.btu.nikoloz.gabrichidze.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/task-controller")
public class TaskController {
    @Autowired
    TaskService taskService;


    @PostMapping("add-task")
    void addTask(@RequestBody AddTaskInput addTaskInput){
        taskService.addTask(addTaskInput);
    }
    @PostMapping("delete-task")
    void deleteTask(@RequestBody DeleteTaskInput deleteTaskInput){
        taskService.deleteTask(deleteTaskInput);
    }
    @GetMapping("get-tasks")
    GetTasksOutput getTasks(){
        return taskService.getTasks();
    }
}

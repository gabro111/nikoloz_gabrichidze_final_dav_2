package ge.btu.nikoloz.gabrichidze.service.impl;

import ge.btu.nikoloz.gabrichidze.dto.AddTaskInput;
import ge.btu.nikoloz.gabrichidze.dto.DeleteTaskInput;
import ge.btu.nikoloz.gabrichidze.dto.GetTasksOutput;
import ge.btu.nikoloz.gabrichidze.dto.TaskDTO;
import ge.btu.nikoloz.gabrichidze.model.Task;
import ge.btu.nikoloz.gabrichidze.repository.TaskRepository;
import ge.btu.nikoloz.gabrichidze.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;
    @Override
    public void addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());
        taskRepository.save(task);

    }

    @Override
    public void deleteTask(DeleteTaskInput deleteTaskInput) {
        taskRepository.deleteById(deleteTaskInput.getId());
    }

    @Override
    public GetTasksOutput getTasks() {
        List<Task> taskList = taskRepository.findAll();
        GetTasksOutput moviesOutput = new GetTasksOutput();
        List<TaskDTO> taskDTOS = new ArrayList<>();

        for(Task task : taskList){
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
            taskDTOS.add(taskDTO);
        }

        moviesOutput.setTasks(taskDTOS);

        return moviesOutput;
    }
}

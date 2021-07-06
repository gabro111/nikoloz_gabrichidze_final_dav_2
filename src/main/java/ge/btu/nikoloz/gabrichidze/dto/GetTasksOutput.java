package ge.btu.nikoloz.gabrichidze.dto;

import lombok.Data;

import java.util.List;
@Data
public class GetTasksOutput {
    List<TaskDTO> tasks;
}

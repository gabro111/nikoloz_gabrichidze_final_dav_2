package ge.btu.nikoloz.gabrichidze.dto;

import lombok.Data;

import java.util.Date;


@Data
public class TaskDTO {
    private long id;
    String title;
    String description;
    Date startDate;
    Date endDate;
}

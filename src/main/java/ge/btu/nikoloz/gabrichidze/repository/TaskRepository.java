package ge.btu.nikoloz.gabrichidze.repository;

import ge.btu.nikoloz.gabrichidze.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}

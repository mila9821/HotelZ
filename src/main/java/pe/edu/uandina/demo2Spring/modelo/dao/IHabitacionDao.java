package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Habitacion;


public interface IHabitacionDao extends CrudRepository<Habitacion, Long> {
}

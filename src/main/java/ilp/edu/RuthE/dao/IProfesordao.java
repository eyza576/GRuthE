package ilp.edu.RuthE.dao;

import ilp.edu.RuthE.entity.Persona;
import ilp.edu.RuthE.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesordao extends JpaRepository<Profesor,Long> {
}

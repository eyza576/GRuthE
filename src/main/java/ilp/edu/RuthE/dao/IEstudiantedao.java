package ilp.edu.RuthE.dao;


import ilp.edu.RuthE.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudiantedao  extends JpaRepository <Estudiante,Long> {
}

package ilp.edu.RuthE.service;

import ilp.edu.RuthE.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {

    List<Asignatura>listarasignaturas();
   /* List<Asignatura> lista();*/
Asignatura registrarasignatura(Asignatura asignatura);
}

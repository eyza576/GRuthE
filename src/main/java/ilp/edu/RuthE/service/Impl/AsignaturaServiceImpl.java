package ilp.edu.RuthE.service.Impl;

import ilp.edu.RuthE.dao.AsignaturaDao;
import ilp.edu.RuthE.entity.Asignatura;
import ilp.edu.RuthE.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaServiceImpl implements IAsignaturaService {
@Autowired
private AsignaturaDao asignaturaDao;

    @Override
    public Asignatura registrarasignatura(Asignatura asignatura) {
        return this.asignaturaDao.save(asignatura);
    }

    @Override
    public List<Asignatura> listarasignaturas() {
        return this.asignaturaDao.findAll();
    }
}

package ilp.edu.RuthE.service.Impl;

import ilp.edu.RuthE.dao.IEstudiantedao;
import ilp.edu.RuthE.entity.Estudiante;
import ilp.edu.RuthE.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudiantedao estudiantedao;
    @Override
    public Estudiante obtenerestudianteporcodigo(String codigo) {
        return this.estudiantedao.findBycodigo(codigo);
    }
}

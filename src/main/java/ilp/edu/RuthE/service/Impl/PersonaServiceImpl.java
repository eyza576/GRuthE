package ilp.edu.RuthE.service.Impl;


import ilp.edu.RuthE.dao.IPersonadao;
import ilp.edu.RuthE.entity.Persona;
import ilp.edu.RuthE.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonadao personadao;
    @Override
    public List<Persona> listarPersona() {

        return this.personadao.findAll();
    }
}

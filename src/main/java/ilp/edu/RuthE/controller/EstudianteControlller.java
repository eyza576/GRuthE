package ilp.edu.RuthE.controller;

import ilp.edu.RuthE.entity.Direccion;
import ilp.edu.RuthE.entity.Estudiante;
import ilp.edu.RuthE.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class EstudianteControlller {
    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/buscarporcodigo")
    public Estudiante buscarporcodigo(@RequestParam String codigo) {
        return this.estudianteService.obtenerestudianteporcodigo(codigo);


    }

}

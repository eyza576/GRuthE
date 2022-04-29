package ilp.edu.RuthE.controller;

import ilp.edu.RuthE.entity.Persona;

import ilp.edu.RuthE.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PruebaController {
    @Autowired
    private IPersonaService personaService;
        @GetMapping("/listarpersona")
            public List<Persona> listarPersona() {
return this.personaService.listarPersona();
            }

}

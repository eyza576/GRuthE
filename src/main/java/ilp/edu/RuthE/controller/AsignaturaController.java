package ilp.edu.RuthE.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.ObjectMapper;
import ilp.edu.RuthE.entity.Asignatura;
import ilp.edu.RuthE.payload.RestResponse;
import ilp.edu.RuthE.service.IAsignaturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("asignatura")
@CrossOrigin(origins = "http://localhost:4200")
public class AsignaturaController {
    @Autowired
    private IAsignaturaService iAsignaturaService;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/listar")
    public RestResponse listaasignatura(){
        List<Asignatura> asignaturaList =  this.iAsignaturaService.listarasignaturas();
        try{
            if (asignaturaList.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron registros");
            }else {
                return new RestResponse(HttpStatus.OK.value(),"Registro de asignaturas ",asignaturaList);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Estamos trabajando en ello, vuelva mas tarde");
        }
    }



    @PostMapping("/registrar")
    public RestResponse registrar(@RequestBody String jsonAsignatura) throws JsonProcessingException {
        Asignatura asignatura = this.objectMapper.readValue(jsonAsignatura, Asignatura.class);
        try {
            this.iAsignaturaService.registrarasignatura(asignatura);
            return new RestResponse(HttpStatus.OK.value(), "Registro de Asignatura correcta",asignatura);
        } catch (Exception e) {
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Lamentamos el inconveniente, vuelva mas tarde");
        }
    }

}

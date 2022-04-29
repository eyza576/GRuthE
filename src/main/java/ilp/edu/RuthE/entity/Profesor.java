package ilp.edu.RuthE.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="profesor")
public class Profesor  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprofesor")
    private  Long idprofesor;
    private String salario;

    @OneToMany(mappedBy = "profesor")
    private List<Estudiante> estudiantes;

    public Profesor() {
    }

    public Profesor(Long idprofesor, String salario) {
        this.idprofesor = idprofesor;
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}

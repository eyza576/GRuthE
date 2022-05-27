package ilp.edu.RuthE.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Asignatura {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idasignatura;
 private String nombre;
 @OneToOne
    @JoinColumn(name = "idpersona",referencedColumnName = "idpersona")
    private Persona persona;
 @ManyToMany
    @JoinTable(name = "asignaturas_materias",joinColumns = @JoinColumn(name = "idasignaturas"),inverseJoinColumns = @JoinColumn(name = "iddocente"))
    private Set<Docente>nuevo=new HashSet<>();

    public Asignatura() {
    }

    public Asignatura(Long idasignatura, String nombre, Persona persona, Set<Docente> nuevo) {
        this.idasignatura = idasignatura;
        this.nombre = nombre;
        this.persona = persona;
        this.nuevo = nuevo;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<Docente> getNuevo() {
        return nuevo;
    }

    public void setNuevo(Set<Docente> nuevo) {
        this.nuevo = nuevo;
    }
}

package ilp.edu.RuthE.entity;

import javax.persistence.*;

@Entity
@Table(name = "docente")
public class Docente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long iddocente;
  private String nombre;
 private String telefono;

    public Docente() {
    }

    public Docente(Long iddocente, String nombre, String telefono) {
        this.iddocente = iddocente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Long getIddocente() {
        return iddocente;
    }

    public void setIddocente(Long iddocente) {
        this.iddocente = iddocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
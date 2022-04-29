package ilp.edu.RuthE.entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante  extends Persona{

    private String codigo;
    private String verificarserie;

    @OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="idprofesor")
    private Profesor profesor;

    public Estudiante(String codigo, String verificarserie) {
        this.codigo = codigo;
        this.verificarserie = verificarserie;
    }

    public Estudiante(Long idpersona, String nombre, int telefono, String email, String codigo, String verificarserie) {
        super(idpersona, nombre, telefono, email);
        this.codigo = codigo;
        this.verificarserie = verificarserie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getVerificarserie() {
        return verificarserie;
    }

    public void setVerificarserie(String verificarserie) {
        this.verificarserie = verificarserie;
    }
}

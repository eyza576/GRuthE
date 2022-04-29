package ilp.edu.RuthE.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Direccion extends Persona {
    @Column(name = "coddirecion" ,length = 15)
    private String coddireccion;
    @Column(name = "calle",length = 25)
    private String calle;
    private String cuidad;
    private String estado;
    private String codigopostal;
    private String pais;

    public Direccion() {
    }

    public Direccion(Long idpersona, String nombre, int telefono, String email) {
        super(idpersona, nombre, telefono, email);
    }

    public Direccion(String coddireccion, String calle, String cuidad, String estado, String codigopostal, String pais) {
        this.coddireccion = coddireccion;
        this.calle = calle;
        this.cuidad = cuidad;
        this.estado = estado;
        this.codigopostal = codigopostal;
        this.pais = pais;
    }

    public Direccion(Long idpersona, String nombre, int telefono, String email, String coddireccion, String calle, String cuidad, String estado, String codigopostal, String pais) {
        super(idpersona, nombre, telefono, email);
        this.coddireccion = coddireccion;
        this.calle = calle;
        this.cuidad = cuidad;
        this.estado = estado;
        this.codigopostal = codigopostal;
        this.pais = pais;
    }

    public String getCoddireccion() {
        return coddireccion;
    }

    public void setCoddireccion(String coddireccion) {
        this.coddireccion = coddireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

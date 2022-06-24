package ilp.edu.RuthE.entity;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")
public class Asignatura {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idasignatura;
    private  String denoominacion;
    private  String sigla;
    private String credito;

    public Asignatura() {
    }

    public Asignatura(Long idasignatura, String denoominacion, String sigla, String credito) {
        this.idasignatura = idasignatura;
        this.denoominacion = denoominacion;
        this.sigla = sigla;
        this.credito = credito;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getDenoominacion() {
        return denoominacion;
    }

    public void setDenoominacion(String denoominacion) {
        this.denoominacion = denoominacion;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}

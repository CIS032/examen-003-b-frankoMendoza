/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "PROFESORES", catalog = "", schema = "ALEX")
@NamedQueries({
    @NamedQuery(name = "Profesores.findAll", query = "SELECT p FROM Profesores p")
    , @NamedQuery(name = "Profesores.findByCedula", query = "SELECT p FROM Profesores p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Profesores.findByNombres", query = "SELECT p FROM Profesores p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Profesores.findByApellidos", query = "SELECT p FROM Profesores p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Profesores.findByCarrera", query = "SELECT p FROM Profesores p WHERE p.carrera = :carrera")
    , @NamedQuery(name = "Profesores.findByTipoDeProfesor", query = "SELECT p FROM Profesores p WHERE p.tipoDeProfesor = :tipoDeProfesor")
    , @NamedQuery(name = "Profesores.findByHorasClase", query = "SELECT p FROM Profesores p WHERE p.horasClase = :horasClase")
    , @NamedQuery(name = "Profesores.findByHorasComplementarias", query = "SELECT p FROM Profesores p WHERE p.horasComplementarias = :horasComplementarias")})
public class Profesores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "CARRERA")
    private String carrera;
    @Column(name = "TIPO_DE_PROFESOR")
    private String tipoDeProfesor;
    @Column(name = "HORAS_CLASE")
    private Integer horasClase;
    @Column(name = "HORAS_COMPLEMENTARIAS")
    private Integer horasComplementarias;

    public Profesores() {
    }

    public Profesores(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        String oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        String oldNombres = this.nombres;
        this.nombres = nombres;
        changeSupport.firePropertyChange("nombres", oldNombres, nombres);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        changeSupport.firePropertyChange("apellidos", oldApellidos, apellidos);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        String oldCarrera = this.carrera;
        this.carrera = carrera;
        changeSupport.firePropertyChange("carrera", oldCarrera, carrera);
    }

    public String getTipoDeProfesor() {
        return tipoDeProfesor;
    }

    public void setTipoDeProfesor(String tipoDeProfesor) {
        String oldTipoDeProfesor = this.tipoDeProfesor;
        this.tipoDeProfesor = tipoDeProfesor;
        changeSupport.firePropertyChange("tipoDeProfesor", oldTipoDeProfesor, tipoDeProfesor);
    }

    public Integer getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Integer horasClase) {
        Integer oldHorasClase = this.horasClase;
        this.horasClase = horasClase;
        changeSupport.firePropertyChange("horasClase", oldHorasClase, horasClase);
    }

    public Integer getHorasComplementarias() {
        return horasComplementarias;
    }

    public void setHorasComplementarias(Integer horasComplementarias) {
        Integer oldHorasComplementarias = this.horasComplementarias;
        this.horasComplementarias = horasComplementarias;
        changeSupport.firePropertyChange("horasComplementarias", oldHorasComplementarias, horasComplementarias);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesores)) {
            return false;
        }
        Profesores other = (Profesores) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Programacion.Profesores[ cedula=" + cedula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

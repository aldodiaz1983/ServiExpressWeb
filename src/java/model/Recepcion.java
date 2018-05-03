/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "RECEPCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recepcion.findAll", query = "SELECT r FROM Recepcion r")
    , @NamedQuery(name = "Recepcion.findByIdRegistro", query = "SELECT r FROM Recepcion r WHERE r.idRegistro = :idRegistro")
    , @NamedQuery(name = "Recepcion.findByObservaciones", query = "SELECT r FROM Recepcion r WHERE r.observaciones = :observaciones")
    , @NamedQuery(name = "Recepcion.findByKilometraje", query = "SELECT r FROM Recepcion r WHERE r.kilometraje = :kilometraje")})
public class Recepcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_REGISTRO")
    private Integer idRegistro;
    @Size(max = 200)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "KILOMETRAJE")
    private Integer kilometraje;
    @JoinColumn(name = "VEHICULO_PATENTE", referencedColumnName = "PATENTE")
    @ManyToOne(optional = false)
    private Vehiculo vehiculoPatente;

    public Recepcion() {
    }

    public Recepcion(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Vehiculo getVehiculoPatente() {
        return vehiculoPatente;
    }

    public void setVehiculoPatente(Vehiculo vehiculoPatente) {
        this.vehiculoPatente = vehiculoPatente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recepcion)) {
            return false;
        }
        Recepcion other = (Recepcion) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Recepcion[ idRegistro=" + idRegistro + " ]";
    }
    
}

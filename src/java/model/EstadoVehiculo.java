/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "ESTADO_VEHICULO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoVehiculo.findAll", query = "SELECT e FROM EstadoVehiculo e")
    , @NamedQuery(name = "EstadoVehiculo.findByIdReparacion", query = "SELECT e FROM EstadoVehiculo e WHERE e.idReparacion = :idReparacion")
    , @NamedQuery(name = "EstadoVehiculo.findByEstadoVehiculo", query = "SELECT e FROM EstadoVehiculo e WHERE e.estadoVehiculo = :estadoVehiculo")
    , @NamedQuery(name = "EstadoVehiculo.findByFecha", query = "SELECT e FROM EstadoVehiculo e WHERE e.fecha = :fecha")})
public class EstadoVehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_REPARACION")
    private Long idReparacion;
    @Size(max = 300)
    @Column(name = "ESTADO_VEHICULO")
    private String estadoVehiculo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "VEHICULO_PATENTE", referencedColumnName = "PATENTE")
    @ManyToOne(optional = false)
    private Vehiculo vehiculoPatente;

    public EstadoVehiculo() {
    }

    public EstadoVehiculo(Long idReparacion) {
        this.idReparacion = idReparacion;
    }

    public Long getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(Long idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        hash += (idReparacion != null ? idReparacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoVehiculo)) {
            return false;
        }
        EstadoVehiculo other = (EstadoVehiculo) object;
        if ((this.idReparacion == null && other.idReparacion != null) || (this.idReparacion != null && !this.idReparacion.equals(other.idReparacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.EstadoVehiculo[ idReparacion=" + idReparacion + " ]";
    }
    
}

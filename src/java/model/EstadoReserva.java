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
@Table(name = "ESTADO_RESERVA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoReserva.findAll", query = "SELECT e FROM EstadoReserva e")
    , @NamedQuery(name = "EstadoReserva.findByIdEstadoReserva", query = "SELECT e FROM EstadoReserva e WHERE e.idEstadoReserva = :idEstadoReserva")
    , @NamedQuery(name = "EstadoReserva.findByEstado", query = "SELECT e FROM EstadoReserva e WHERE e.estado = :estado")
    , @NamedQuery(name = "EstadoReserva.findByFecha", query = "SELECT e FROM EstadoReserva e WHERE e.fecha = :fecha")})
public class EstadoReserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ESTADO_RESERVA")
    private Long idEstadoReserva;
    @Size(max = 30)
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "RESERVA_RESERVA_ID", referencedColumnName = "RESERVA_ID")
    @ManyToOne(optional = false)
    private Reserva reservaReservaId;

    public EstadoReserva() {
    }

    public EstadoReserva(Long idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public Long getIdEstadoReserva() {
        return idEstadoReserva;
    }

    public void setIdEstadoReserva(Long idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Reserva getReservaReservaId() {
        return reservaReservaId;
    }

    public void setReservaReservaId(Reserva reservaReservaId) {
        this.reservaReservaId = reservaReservaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoReserva != null ? idEstadoReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoReserva)) {
            return false;
        }
        EstadoReserva other = (EstadoReserva) object;
        if ((this.idEstadoReserva == null && other.idEstadoReserva != null) || (this.idEstadoReserva != null && !this.idEstadoReserva.equals(other.idEstadoReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.EstadoReserva[ idEstadoReserva=" + idEstadoReserva + " ]";
    }
    
}

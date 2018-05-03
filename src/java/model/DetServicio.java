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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "DET_SERVICIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetServicio.findAll", query = "SELECT d FROM DetServicio d")
    , @NamedQuery(name = "DetServicio.findByDetId", query = "SELECT d FROM DetServicio d WHERE d.detId = :detId")})
public class DetServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET_ID")
    private Long detId;
    @JoinColumn(name = "COTIZACION_NUMERO_COT", referencedColumnName = "NUMERO_COT")
    @ManyToOne(optional = false)
    private Cotizacion cotizacionNumeroCot;
    @JoinColumn(name = "SERVICIO_SERVICIO_ID", referencedColumnName = "SERVICIO_ID")
    @ManyToOne(optional = false)
    private Servicio servicioServicioId;

    public DetServicio() {
    }

    public DetServicio(Long detId) {
        this.detId = detId;
    }

    public Long getDetId() {
        return detId;
    }

    public void setDetId(Long detId) {
        this.detId = detId;
    }

    public Cotizacion getCotizacionNumeroCot() {
        return cotizacionNumeroCot;
    }

    public void setCotizacionNumeroCot(Cotizacion cotizacionNumeroCot) {
        this.cotizacionNumeroCot = cotizacionNumeroCot;
    }

    public Servicio getServicioServicioId() {
        return servicioServicioId;
    }

    public void setServicioServicioId(Servicio servicioServicioId) {
        this.servicioServicioId = servicioServicioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detId != null ? detId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetServicio)) {
            return false;
        }
        DetServicio other = (DetServicio) object;
        if ((this.detId == null && other.detId != null) || (this.detId != null && !this.detId.equals(other.detId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DetServicio[ detId=" + detId + " ]";
    }
    
}

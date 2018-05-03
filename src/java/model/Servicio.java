/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "SERVICIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s")
    , @NamedQuery(name = "Servicio.findByServicioId", query = "SELECT s FROM Servicio s WHERE s.servicioId = :servicioId")
    , @NamedQuery(name = "Servicio.findByPrecioServicio", query = "SELECT s FROM Servicio s WHERE s.precioServicio = :precioServicio")
    , @NamedQuery(name = "Servicio.findByDescripcion", query = "SELECT s FROM Servicio s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Servicio.findByFechaCreacion", query = "SELECT s FROM Servicio s WHERE s.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Servicio.findByDisponible", query = "SELECT s FROM Servicio s WHERE s.disponible = :disponible")})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVICIO_ID")
    private Short servicioId;
    @Column(name = "PRECIO_SERVICIO")
    private Integer precioServicio;
    @Size(max = 150)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "DISPONIBLE")
    private Character disponible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicioServicioId")
    private Collection<DetServicio> detServicioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicioServicioId")
    private Collection<ProductoServicio> productoServicioCollection;

    public Servicio() {
    }

    public Servicio(Short servicioId) {
        this.servicioId = servicioId;
    }

    public Short getServicioId() {
        return servicioId;
    }

    public void setServicioId(Short servicioId) {
        this.servicioId = servicioId;
    }

    public Integer getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(Integer precioServicio) {
        this.precioServicio = precioServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Character getDisponible() {
        return disponible;
    }

    public void setDisponible(Character disponible) {
        this.disponible = disponible;
    }

    @XmlTransient
    public Collection<DetServicio> getDetServicioCollection() {
        return detServicioCollection;
    }

    public void setDetServicioCollection(Collection<DetServicio> detServicioCollection) {
        this.detServicioCollection = detServicioCollection;
    }

    @XmlTransient
    public Collection<ProductoServicio> getProductoServicioCollection() {
        return productoServicioCollection;
    }

    public void setProductoServicioCollection(Collection<ProductoServicio> productoServicioCollection) {
        this.productoServicioCollection = productoServicioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servicioId != null ? servicioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.servicioId == null && other.servicioId != null) || (this.servicioId != null && !this.servicioId.equals(other.servicioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Servicio[ servicioId=" + servicioId + " ]";
    }
    
}

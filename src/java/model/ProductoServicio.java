/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PRODUCTO_SERVICIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductoServicio.findAll", query = "SELECT p FROM ProductoServicio p")
    , @NamedQuery(name = "ProductoServicio.findByIdPs", query = "SELECT p FROM ProductoServicio p WHERE p.idPs = :idPs")})
public class ProductoServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PS")
    private BigDecimal idPs;
    @JoinColumn(name = "PRODUCTO_PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID")
    @ManyToOne(optional = false)
    private Producto productoProductoId;
    @JoinColumn(name = "SERVICIO_SERVICIO_ID", referencedColumnName = "SERVICIO_ID")
    @ManyToOne(optional = false)
    private Servicio servicioServicioId;

    public ProductoServicio() {
    }

    public ProductoServicio(BigDecimal idPs) {
        this.idPs = idPs;
    }

    public BigDecimal getIdPs() {
        return idPs;
    }

    public void setIdPs(BigDecimal idPs) {
        this.idPs = idPs;
    }

    public Producto getProductoProductoId() {
        return productoProductoId;
    }

    public void setProductoProductoId(Producto productoProductoId) {
        this.productoProductoId = productoProductoId;
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
        hash += (idPs != null ? idPs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoServicio)) {
            return false;
        }
        ProductoServicio other = (ProductoServicio) object;
        if ((this.idPs == null && other.idPs != null) || (this.idPs != null && !this.idPs.equals(other.idPs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ProductoServicio[ idPs=" + idPs + " ]";
    }
    
}

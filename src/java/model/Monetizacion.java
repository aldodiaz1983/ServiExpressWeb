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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "MONETIZACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Monetizacion.findAll", query = "SELECT m FROM Monetizacion m")
    , @NamedQuery(name = "Monetizacion.findByIdMonetizacion", query = "SELECT m FROM Monetizacion m WHERE m.idMonetizacion = :idMonetizacion")
    , @NamedQuery(name = "Monetizacion.findByFechaRegistro", query = "SELECT m FROM Monetizacion m WHERE m.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Monetizacion.findByIva", query = "SELECT m FROM Monetizacion m WHERE m.iva = :iva")
    , @NamedQuery(name = "Monetizacion.findByValorDolar", query = "SELECT m FROM Monetizacion m WHERE m.valorDolar = :valorDolar")
    , @NamedQuery(name = "Monetizacion.findByValorEuro", query = "SELECT m FROM Monetizacion m WHERE m.valorEuro = :valorEuro")
    , @NamedQuery(name = "Monetizacion.findByValorYen", query = "SELECT m FROM Monetizacion m WHERE m.valorYen = :valorYen")})
public class Monetizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MONETIZACION")
    private Long idMonetizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "IVA")
    private Short iva;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_DOLAR")
    private Double valorDolar;
    @Column(name = "VALOR_EURO")
    private Double valorEuro;
    @Column(name = "VALOR_YEN")
    private Double valorYen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "monetizacionIdMonetizacion")
    private Collection<Facturacion> facturacionCollection;

    public Monetizacion() {
    }

    public Monetizacion(Long idMonetizacion) {
        this.idMonetizacion = idMonetizacion;
    }

    public Monetizacion(Long idMonetizacion, Date fechaRegistro) {
        this.idMonetizacion = idMonetizacion;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getIdMonetizacion() {
        return idMonetizacion;
    }

    public void setIdMonetizacion(Long idMonetizacion) {
        this.idMonetizacion = idMonetizacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Short getIva() {
        return iva;
    }

    public void setIva(Short iva) {
        this.iva = iva;
    }

    public Double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(Double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public Double getValorEuro() {
        return valorEuro;
    }

    public void setValorEuro(Double valorEuro) {
        this.valorEuro = valorEuro;
    }

    public Double getValorYen() {
        return valorYen;
    }

    public void setValorYen(Double valorYen) {
        this.valorYen = valorYen;
    }

    @XmlTransient
    public Collection<Facturacion> getFacturacionCollection() {
        return facturacionCollection;
    }

    public void setFacturacionCollection(Collection<Facturacion> facturacionCollection) {
        this.facturacionCollection = facturacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMonetizacion != null ? idMonetizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monetizacion)) {
            return false;
        }
        Monetizacion other = (Monetizacion) object;
        if ((this.idMonetizacion == null && other.idMonetizacion != null) || (this.idMonetizacion != null && !this.idMonetizacion.equals(other.idMonetizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Monetizacion[ idMonetizacion=" + idMonetizacion + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "COTIZACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizacion.findAll", query = "SELECT c FROM Cotizacion c")
    , @NamedQuery(name = "Cotizacion.findByNumeroCot", query = "SELECT c FROM Cotizacion c WHERE c.numeroCot = :numeroCot")
    , @NamedQuery(name = "Cotizacion.findByObservacion", query = "SELECT c FROM Cotizacion c WHERE c.observacion = :observacion")
    , @NamedQuery(name = "Cotizacion.findByAceptaCot", query = "SELECT c FROM Cotizacion c WHERE c.aceptaCot = :aceptaCot")
    , @NamedQuery(name = "Cotizacion.findByVigencia", query = "SELECT c FROM Cotizacion c WHERE c.vigencia = :vigencia")})
public class Cotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_COT")
    private BigDecimal numeroCot;
    @Size(max = 255)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "ACEPTA_COT")
    private Character aceptaCot;
    @Column(name = "VIGENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigencia;
    @JoinColumn(name = "EMPLEADO_ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado empleadoIdEmpleado;
    @JoinColumn(name = "VEHICULO_PATENTE", referencedColumnName = "PATENTE")
    @ManyToOne(optional = false)
    private Vehiculo vehiculoPatente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacionNumeroCot")
    private Collection<DetServicio> detServicioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacionNumeroCot")
    private Collection<Facturacion> facturacionCollection;

    public Cotizacion() {
    }

    public Cotizacion(BigDecimal numeroCot) {
        this.numeroCot = numeroCot;
    }

    public BigDecimal getNumeroCot() {
        return numeroCot;
    }

    public void setNumeroCot(BigDecimal numeroCot) {
        this.numeroCot = numeroCot;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Character getAceptaCot() {
        return aceptaCot;
    }

    public void setAceptaCot(Character aceptaCot) {
        this.aceptaCot = aceptaCot;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public Empleado getEmpleadoIdEmpleado() {
        return empleadoIdEmpleado;
    }

    public void setEmpleadoIdEmpleado(Empleado empleadoIdEmpleado) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }

    public Vehiculo getVehiculoPatente() {
        return vehiculoPatente;
    }

    public void setVehiculoPatente(Vehiculo vehiculoPatente) {
        this.vehiculoPatente = vehiculoPatente;
    }

    @XmlTransient
    public Collection<DetServicio> getDetServicioCollection() {
        return detServicioCollection;
    }

    public void setDetServicioCollection(Collection<DetServicio> detServicioCollection) {
        this.detServicioCollection = detServicioCollection;
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
        hash += (numeroCot != null ? numeroCot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizacion)) {
            return false;
        }
        Cotizacion other = (Cotizacion) object;
        if ((this.numeroCot == null && other.numeroCot != null) || (this.numeroCot != null && !this.numeroCot.equals(other.numeroCot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cotizacion[ numeroCot=" + numeroCot + " ]";
    }
    
}

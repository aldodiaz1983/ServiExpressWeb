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
@Table(name = "FACTURACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturacion.findAll", query = "SELECT f FROM Facturacion f")
    , @NamedQuery(name = "Facturacion.findByFacturacionId", query = "SELECT f FROM Facturacion f WHERE f.facturacionId = :facturacionId")
    , @NamedQuery(name = "Facturacion.findByFactura", query = "SELECT f FROM Facturacion f WHERE f.factura = :factura")
    , @NamedQuery(name = "Facturacion.findByMontoBruto", query = "SELECT f FROM Facturacion f WHERE f.montoBruto = :montoBruto")
    , @NamedQuery(name = "Facturacion.findByMontoTotal", query = "SELECT f FROM Facturacion f WHERE f.montoTotal = :montoTotal")
    , @NamedQuery(name = "Facturacion.findByFechaFacturacion", query = "SELECT f FROM Facturacion f WHERE f.fechaFacturacion = :fechaFacturacion")
    , @NamedQuery(name = "Facturacion.findByModoPago", query = "SELECT f FROM Facturacion f WHERE f.modoPago = :modoPago")
    , @NamedQuery(name = "Facturacion.findByActivo", query = "SELECT f FROM Facturacion f WHERE f.activo = :activo")})
public class Facturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACTURACION_ID")
    private Integer facturacionId;
    @Column(name = "FACTURA")
    private Character factura;
    @Column(name = "MONTO_BRUTO")
    private Integer montoBruto;
    @Column(name = "MONTO_TOTAL")
    private Integer montoTotal;
    @Column(name = "FECHA_FACTURACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFacturacion;
    @Size(max = 20)
    @Column(name = "MODO_PAGO")
    private String modoPago;
    @Column(name = "ACTIVO")
    private Character activo;
    @JoinColumn(name = "COTIZACION_NUMERO_COT", referencedColumnName = "NUMERO_COT")
    @ManyToOne(optional = false)
    private Cotizacion cotizacionNumeroCot;
    @JoinColumn(name = "EMPLEADO_ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado empleadoIdEmpleado;
    @JoinColumn(name = "MONETIZACION_ID_MONETIZACION", referencedColumnName = "ID_MONETIZACION")
    @ManyToOne(optional = false)
    private Monetizacion monetizacionIdMonetizacion;

    public Facturacion() {
    }

    public Facturacion(Integer facturacionId) {
        this.facturacionId = facturacionId;
    }

    public Integer getFacturacionId() {
        return facturacionId;
    }

    public void setFacturacionId(Integer facturacionId) {
        this.facturacionId = facturacionId;
    }

    public Character getFactura() {
        return factura;
    }

    public void setFactura(Character factura) {
        this.factura = factura;
    }

    public Integer getMontoBruto() {
        return montoBruto;
    }

    public void setMontoBruto(Integer montoBruto) {
        this.montoBruto = montoBruto;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public String getModoPago() {
        return modoPago;
    }

    public void setModoPago(String modoPago) {
        this.modoPago = modoPago;
    }

    public Character getActivo() {
        return activo;
    }

    public void setActivo(Character activo) {
        this.activo = activo;
    }

    public Cotizacion getCotizacionNumeroCot() {
        return cotizacionNumeroCot;
    }

    public void setCotizacionNumeroCot(Cotizacion cotizacionNumeroCot) {
        this.cotizacionNumeroCot = cotizacionNumeroCot;
    }

    public Empleado getEmpleadoIdEmpleado() {
        return empleadoIdEmpleado;
    }

    public void setEmpleadoIdEmpleado(Empleado empleadoIdEmpleado) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }

    public Monetizacion getMonetizacionIdMonetizacion() {
        return monetizacionIdMonetizacion;
    }

    public void setMonetizacionIdMonetizacion(Monetizacion monetizacionIdMonetizacion) {
        this.monetizacionIdMonetizacion = monetizacionIdMonetizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturacionId != null ? facturacionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturacion)) {
            return false;
        }
        Facturacion other = (Facturacion) object;
        if ((this.facturacionId == null && other.facturacionId != null) || (this.facturacionId != null && !this.facturacionId.equals(other.facturacionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Facturacion[ facturacionId=" + facturacionId + " ]";
    }
    
}

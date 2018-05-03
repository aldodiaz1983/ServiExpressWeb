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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ORDEN_PEDIDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenPedido.findAll", query = "SELECT o FROM OrdenPedido o")
    , @NamedQuery(name = "OrdenPedido.findByPedidoId", query = "SELECT o FROM OrdenPedido o WHERE o.pedidoId = :pedidoId")
    , @NamedQuery(name = "OrdenPedido.findByFechaPedido", query = "SELECT o FROM OrdenPedido o WHERE o.fechaPedido = :fechaPedido")
    , @NamedQuery(name = "OrdenPedido.findByFechaRecepcion", query = "SELECT o FROM OrdenPedido o WHERE o.fechaRecepcion = :fechaRecepcion")
    , @NamedQuery(name = "OrdenPedido.findByEnviadoProveedor", query = "SELECT o FROM OrdenPedido o WHERE o.enviadoProveedor = :enviadoProveedor")
    , @NamedQuery(name = "OrdenPedido.findByProductosRecibidos", query = "SELECT o FROM OrdenPedido o WHERE o.productosRecibidos = :productosRecibidos")})
public class OrdenPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PEDIDO_ID")
    private Integer pedidoId;
    @Column(name = "FECHA_PEDIDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;
    @Column(name = "FECHA_RECEPCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRecepcion;
    @Column(name = "ENVIADO_PROVEEDOR")
    private Character enviadoProveedor;
    @Column(name = "PRODUCTOS_RECIBIDOS")
    private Character productosRecibidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenPedidoPedidoId")
    private Collection<DetPedido> detPedidoCollection;
    @JoinColumn(name = "EMPLEADO_ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado empleadoIdEmpleado;
    @JoinColumn(name = "PROVEEDOR_ID_PROVEEDOR", referencedColumnName = "ID_PROVEEDOR")
    @ManyToOne(optional = false)
    private Proveedor proveedorIdProveedor;

    public OrdenPedido() {
    }

    public OrdenPedido(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Character getEnviadoProveedor() {
        return enviadoProveedor;
    }

    public void setEnviadoProveedor(Character enviadoProveedor) {
        this.enviadoProveedor = enviadoProveedor;
    }

    public Character getProductosRecibidos() {
        return productosRecibidos;
    }

    public void setProductosRecibidos(Character productosRecibidos) {
        this.productosRecibidos = productosRecibidos;
    }

    @XmlTransient
    public Collection<DetPedido> getDetPedidoCollection() {
        return detPedidoCollection;
    }

    public void setDetPedidoCollection(Collection<DetPedido> detPedidoCollection) {
        this.detPedidoCollection = detPedidoCollection;
    }

    public Empleado getEmpleadoIdEmpleado() {
        return empleadoIdEmpleado;
    }

    public void setEmpleadoIdEmpleado(Empleado empleadoIdEmpleado) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }

    public Proveedor getProveedorIdProveedor() {
        return proveedorIdProveedor;
    }

    public void setProveedorIdProveedor(Proveedor proveedorIdProveedor) {
        this.proveedorIdProveedor = proveedorIdProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoId != null ? pedidoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenPedido)) {
            return false;
        }
        OrdenPedido other = (OrdenPedido) object;
        if ((this.pedidoId == null && other.pedidoId != null) || (this.pedidoId != null && !this.pedidoId.equals(other.pedidoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.OrdenPedido[ pedidoId=" + pedidoId + " ]";
    }
    
}

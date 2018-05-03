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
@Table(name = "DET_PEDIDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetPedido.findAll", query = "SELECT d FROM DetPedido d")
    , @NamedQuery(name = "DetPedido.findByDetPedido", query = "SELECT d FROM DetPedido d WHERE d.detPedido = :detPedido")
    , @NamedQuery(name = "DetPedido.findByDescripcion", query = "SELECT d FROM DetPedido d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "DetPedido.findByCantidad", query = "SELECT d FROM DetPedido d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DetPedido.findByPrecio", query = "SELECT d FROM DetPedido d WHERE d.precio = :precio")
    , @NamedQuery(name = "DetPedido.findByCategoria", query = "SELECT d FROM DetPedido d WHERE d.categoria = :categoria")
    , @NamedQuery(name = "DetPedido.findByMarca", query = "SELECT d FROM DetPedido d WHERE d.marca = :marca")})
public class DetPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET_PEDIDO")
    private Long detPedido;
    @Size(max = 150)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CANTIDAD")
    private Short cantidad;
    @Column(name = "PRECIO")
    private Long precio;
    @Size(max = 20)
    @Column(name = "CATEGORIA")
    private String categoria;
    @Size(max = 20)
    @Column(name = "MARCA")
    private String marca;
    @JoinColumn(name = "ORDEN_PEDIDO_PEDIDO_ID", referencedColumnName = "PEDIDO_ID")
    @ManyToOne(optional = false)
    private OrdenPedido ordenPedidoPedidoId;

    public DetPedido() {
    }

    public DetPedido(Long detPedido) {
        this.detPedido = detPedido;
    }

    public Long getDetPedido() {
        return detPedido;
    }

    public void setDetPedido(Long detPedido) {
        this.detPedido = detPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public OrdenPedido getOrdenPedidoPedidoId() {
        return ordenPedidoPedidoId;
    }

    public void setOrdenPedidoPedidoId(OrdenPedido ordenPedidoPedidoId) {
        this.ordenPedidoPedidoId = ordenPedidoPedidoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detPedido != null ? detPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetPedido)) {
            return false;
        }
        DetPedido other = (DetPedido) object;
        if ((this.detPedido == null && other.detPedido != null) || (this.detPedido != null && !this.detPedido.equals(other.detPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DetPedido[ detPedido=" + detPedido + " ]";
    }
    
}

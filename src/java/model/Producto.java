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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByProductoId", query = "SELECT p FROM Producto p WHERE p.productoId = :productoId")
    , @NamedQuery(name = "Producto.findByMarca", query = "SELECT p FROM Producto p WHERE p.marca = :marca")
    , @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Producto.findByCantidad", query = "SELECT p FROM Producto p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Producto.findByFechaVencimiento", query = "SELECT p FROM Producto p WHERE p.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "Producto.findByBrutoProducto", query = "SELECT p FROM Producto p WHERE p.brutoProducto = :brutoProducto")
    , @NamedQuery(name = "Producto.findByNetoProducto", query = "SELECT p FROM Producto p WHERE p.netoProducto = :netoProducto")
    , @NamedQuery(name = "Producto.findByDisponible", query = "SELECT p FROM Producto p WHERE p.disponible = :disponible")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PRODUCTO_ID")
    private String productoId;
    @Size(max = 50)
    @Column(name = "MARCA")
    private String marca;
    @Size(max = 150)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "BRUTO_PRODUCTO")
    private Long brutoProducto;
    @Column(name = "NETO_PRODUCTO")
    private Long netoProducto;
    @Column(name = "DISPONIBLE")
    private Character disponible;
    @JoinColumn(name = "CATEGORIAS_CATEGORIA_ID", referencedColumnName = "CATEGORIA_ID")
    @ManyToOne(optional = false)
    private Categorias categoriasCategoriaId;
    @JoinColumn(name = "PROVEEDOR_ID_PROVEEDOR", referencedColumnName = "ID_PROVEEDOR")
    @ManyToOne(optional = false)
    private Proveedor proveedorIdProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoProductoId")
    private Collection<ProductoServicio> productoServicioCollection;

    public Producto() {
    }

    public Producto(String productoId) {
        this.productoId = productoId;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Long getBrutoProducto() {
        return brutoProducto;
    }

    public void setBrutoProducto(Long brutoProducto) {
        this.brutoProducto = brutoProducto;
    }

    public Long getNetoProducto() {
        return netoProducto;
    }

    public void setNetoProducto(Long netoProducto) {
        this.netoProducto = netoProducto;
    }

    public Character getDisponible() {
        return disponible;
    }

    public void setDisponible(Character disponible) {
        this.disponible = disponible;
    }

    public Categorias getCategoriasCategoriaId() {
        return categoriasCategoriaId;
    }

    public void setCategoriasCategoriaId(Categorias categoriasCategoriaId) {
        this.categoriasCategoriaId = categoriasCategoriaId;
    }

    public Proveedor getProveedorIdProveedor() {
        return proveedorIdProveedor;
    }

    public void setProveedorIdProveedor(Proveedor proveedorIdProveedor) {
        this.proveedorIdProveedor = proveedorIdProveedor;
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
        hash += (productoId != null ? productoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.productoId == null && other.productoId != null) || (this.productoId != null && !this.productoId.equals(other.productoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Producto[ productoId=" + productoId + " ]";
    }
    
}

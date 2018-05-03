/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jonathan
 */
@Entity
@Table(name = "PROVEEDOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p")
    , @NamedQuery(name = "Proveedor.findByIdProveedor", query = "SELECT p FROM Proveedor p WHERE p.idProveedor = :idProveedor")
    , @NamedQuery(name = "Proveedor.findByRutProveedor", query = "SELECT p FROM Proveedor p WHERE p.rutProveedor = :rutProveedor")
    , @NamedQuery(name = "Proveedor.findByRazonSocial", query = "SELECT p FROM Proveedor p WHERE p.razonSocial = :razonSocial")
    , @NamedQuery(name = "Proveedor.findByTelefono", query = "SELECT p FROM Proveedor p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Proveedor.findByCorreo", query = "SELECT p FROM Proveedor p WHERE p.correo = :correo")
    , @NamedQuery(name = "Proveedor.findByDireccion", query = "SELECT p FROM Proveedor p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Proveedor.findByActivo", query = "SELECT p FROM Proveedor p WHERE p.activo = :activo")
    , @NamedQuery(name = "Proveedor.findByRepresentante", query = "SELECT p FROM Proveedor p WHERE p.representante = :representante")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PROVEEDOR")
    private Long idProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "RUT_PROVEEDOR")
    private String rutProveedor;
    @Size(max = 100)
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Column(name = "TELEFONO")
    private Long telefono;
    @Size(max = 150)
    @Column(name = "CORREO")
    private String correo;
    @Size(max = 150)
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "ACTIVO")
    private Character activo;
    @Size(max = 100)
    @Column(name = "REPRESENTANTE")
    private String representante;
    @JoinColumn(name = "RUBRO_ID_RUBRO", referencedColumnName = "ID_RUBRO")
    @ManyToOne(optional = false)
    private Rubro rubroIdRubro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedorIdProveedor")
    private Collection<Producto> productoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedorIdProveedor")
    private Collection<OrdenPedido> ordenPedidoCollection;

    public Proveedor() {
    }

    public Proveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Proveedor(Long idProveedor, String rutProveedor) {
        this.idProveedor = idProveedor;
        this.rutProveedor = rutProveedor;
    }

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRutProveedor() {
        return rutProveedor;
    }

    public void setRutProveedor(String rutProveedor) {
        this.rutProveedor = rutProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getActivo() {
        return activo;
    }

    public void setActivo(Character activo) {
        this.activo = activo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public Rubro getRubroIdRubro() {
        return rubroIdRubro;
    }

    public void setRubroIdRubro(Rubro rubroIdRubro) {
        this.rubroIdRubro = rubroIdRubro;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @XmlTransient
    public Collection<OrdenPedido> getOrdenPedidoCollection() {
        return ordenPedidoCollection;
    }

    public void setOrdenPedidoCollection(Collection<OrdenPedido> ordenPedidoCollection) {
        this.ordenPedidoCollection = ordenPedidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedor != null ? idProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idProveedor == null && other.idProveedor != null) || (this.idProveedor != null && !this.idProveedor.equals(other.idProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Proveedor[ idProveedor=" + idProveedor + " ]";
    }
    
}

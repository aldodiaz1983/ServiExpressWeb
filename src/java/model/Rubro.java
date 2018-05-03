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
@Table(name = "RUBRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rubro.findAll", query = "SELECT r FROM Rubro r")
    , @NamedQuery(name = "Rubro.findByIdRubro", query = "SELECT r FROM Rubro r WHERE r.idRubro = :idRubro")
    , @NamedQuery(name = "Rubro.findByNombreRubro", query = "SELECT r FROM Rubro r WHERE r.nombreRubro = :nombreRubro")
    , @NamedQuery(name = "Rubro.findByIva", query = "SELECT r FROM Rubro r WHERE r.iva = :iva")
    , @NamedQuery(name = "Rubro.findByCategoriaTributaria", query = "SELECT r FROM Rubro r WHERE r.categoriaTributaria = :categoriaTributaria")})
public class Rubro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_RUBRO")
    private Integer idRubro;
    @Size(max = 150)
    @Column(name = "NOMBRE_RUBRO")
    private String nombreRubro;
    @Column(name = "IVA")
    private Character iva;
    @Size(max = 2)
    @Column(name = "CATEGORIA_TRIBUTARIA")
    private String categoriaTributaria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rubroIdRubro")
    private Collection<Proveedor> proveedorCollection;

    public Rubro() {
    }

    public Rubro(Integer idRubro) {
        this.idRubro = idRubro;
    }

    public Integer getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(Integer idRubro) {
        this.idRubro = idRubro;
    }

    public String getNombreRubro() {
        return nombreRubro;
    }

    public void setNombreRubro(String nombreRubro) {
        this.nombreRubro = nombreRubro;
    }

    public Character getIva() {
        return iva;
    }

    public void setIva(Character iva) {
        this.iva = iva;
    }

    public String getCategoriaTributaria() {
        return categoriaTributaria;
    }

    public void setCategoriaTributaria(String categoriaTributaria) {
        this.categoriaTributaria = categoriaTributaria;
    }

    @XmlTransient
    public Collection<Proveedor> getProveedorCollection() {
        return proveedorCollection;
    }

    public void setProveedorCollection(Collection<Proveedor> proveedorCollection) {
        this.proveedorCollection = proveedorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRubro != null ? idRubro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rubro)) {
            return false;
        }
        Rubro other = (Rubro) object;
        if ((this.idRubro == null && other.idRubro != null) || (this.idRubro != null && !this.idRubro.equals(other.idRubro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Rubro[ idRubro=" + idRubro + " ]";
    }
    
}

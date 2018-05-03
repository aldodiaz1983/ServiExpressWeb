/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;

/**
 *
 * @author Jonathan
 */
public class Empleado{
   
    private Long idEmpleado;
    private Collection<Cotizacion> cotizacionCollection;
    private Rol rolRolId;
    private Usuario usuarioIdUsuario;
    private Collection<Facturacion> facturacionCollection;
    private Collection<Reserva> reservaCollection;
    private Collection<OrdenPedido> ordenPedidoCollection;

    public Empleado() {
    }
    
    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Collection<Cotizacion> getCotizacionCollection() {
        return cotizacionCollection;
    }

    public void setCotizacionCollection(Collection<Cotizacion> cotizacionCollection) {
        this.cotizacionCollection = cotizacionCollection;
    }

    public Rol getRolRolId() {
        return rolRolId;
    }

    public void setRolRolId(Rol rolRolId) {
        this.rolRolId = rolRolId;
    }

    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public Collection<Facturacion> getFacturacionCollection() {
        return facturacionCollection;
    }

    public void setFacturacionCollection(Collection<Facturacion> facturacionCollection) {
        this.facturacionCollection = facturacionCollection;
    }

    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    public Collection<OrdenPedido> getOrdenPedidoCollection() {
        return ordenPedidoCollection;
    }

    public void setOrdenPedidoCollection(Collection<OrdenPedido> ordenPedidoCollection) {
        this.ordenPedidoCollection = ordenPedidoCollection;
    }
    
    
}

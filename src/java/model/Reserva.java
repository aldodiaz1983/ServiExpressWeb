/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Jonathan
 */
public class Reserva{

    private Integer reservaId;
    private Date fechaReservada;
    private String horaReservada;
    private Character estadoReserva;
    private Collection<EstadoReserva> estadoReservaCollection;
    private Cliente clienteIdCliente;
    private Empleado empleadoIdEmpleado;
    private Vehiculo vehiculoPatente;

    public Reserva() {
    }
    
    public Integer getReservaId() {
        return reservaId;
    }

    public void setReservaId(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public Date getFechaReservada() {
        return fechaReservada;
    }

    public void setFechaReservada(Date fechaReservada) {
        this.fechaReservada = fechaReservada;
    }

    public String getHoraReservada() {
        return horaReservada;
    }

    public void setHoraReservada(String horaReservada) {
        this.horaReservada = horaReservada;
    }

    public Character getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(Character estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Collection<EstadoReserva> getEstadoReservaCollection() {
        return estadoReservaCollection;
    }

    public void setEstadoReservaCollection(Collection<EstadoReserva> estadoReservaCollection) {
        this.estadoReservaCollection = estadoReservaCollection;
    }

    public Cliente getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(Cliente clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
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
    
    
}

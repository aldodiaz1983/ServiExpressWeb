/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.ClientErrorException;
import model.Cliente;
import model.ClienteDAO;
import model.EmpleadoDAO;
import model.Reserva;
import model.ReservaDAO;
import model.Vehiculo;
import model.VehiculoDAO;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Empleado;

/**
 *
 * @author Jonathan
 */
@WebServlet(name = "SReserva", urlPatterns = {"/SReserva"})
public class SReserva extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            //Capturo datos de la pagina y rescato valores de la session
            HttpSession session = request.getSession();
            String fecha = request.getParameter("dia") + "/" + request.getParameter("mes") + "/18";
            String horaMinutos = request.getParameter("hora") + ":" + request.getParameter("minutos");
            String annio = request.getParameter("annio");
            int modelo = Integer.parseInt(request.getParameter("modelo"));
            char estado = 'P';
            //Creo objetos de acceso y objetos entidad necesarios
            ClienteDAO cd = new ClienteDAO();
            ReservaDAO rd = new ReservaDAO();
            EmpleadoDAO ed = new EmpleadoDAO();
            VehiculoDAO vd = new VehiculoDAO();
            Cliente cl = (Cliente) session.getAttribute("cliente");

            Vehiculo v = new Vehiculo();
            v.setPatente(vd.countREST() + 1);
            v.setAño(annio);
            v.setColor("Azul");
            v.setClienteIdCliente(cl);
            v.setModeloId(modelo);
            vd.create(v);//Se guarda el vehiculo

            Reserva res = new Reserva();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaDate = null;
            fechaDate = formato.parse(fecha);
            res.setFechaReservada(fechaDate);
            res.setHoraReservada(horaMinutos);
            res.setEstadoReserva(estado);
            //Por defecto asigna al empleado 3 (Aldo)
            res.setEmpleadoIdEmpleado(ed.find(Empleado.class, "3"));
            //Busca al cliente que hace la reserva
            res.setClienteIdCliente(cl);
            res.setVehiculoPatente(v);

            rd.create(res);//Se guarda la reserva
            response.sendRedirect("reserva.jsp");
            
        } catch (ClientErrorException | ParseException e) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

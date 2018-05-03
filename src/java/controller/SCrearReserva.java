/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.GenericType;
import model.Reserva;
import model.ReservaDAO;

/**
 *
 * @author Jonathan
 */
@WebServlet(name = "SCrearReserva", urlPatterns = {"/SCrearReserva"})
public class SCrearReserva extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            //String name = request.getParameter("name");
            HttpSession ses = request.getSession();
            //Cliente cli = new Cliente();
            //ClienteDAO cliDao = new ClienteDAO();
            //Categorias cat = new Categorias();
            //CategoriasDAO catDAO = new CategoriasDAO();

            //int ii = ;
            //int ii = 4;
            //short  iii = (short)ii;
            //cat.setCategoriaId(iii);
            //cat.setDescripcion("descripcion categoria");
            //catDAO.create_JSON(cat);
            ReservaDAO rDAO = new ReservaDAO();

            //GenericType<List<Cliente>> gc = new GenericType<List<Cliente>>(){};
            //List<Cliente> listaCliente = (List<Cliente>) cliDao.findAll_JSON(gc);   
            GenericType<List<Reserva>> gr = new GenericType<List<Reserva>>() {
            };
            List<Reserva> listaReserva = (List<Reserva>) rDAO.findAll(gr);

            //List<Cliente> pkgLine = cliDao.findAll(List.class);
            //session.setAttribute("SesClientes", listaCliente);
            ses.setAttribute("SesReserva", listaReserva);

            response.sendRedirect("creareserva.jsp");
            //cliDao.close();

            /*for (Reserva res : listaReserva) {
                Cliente ReservaCliente = res.getClienteIdCliente();
                int idClienteReserva = ReservaCliente.getIdCliente();
                
                
                if(cli.getIdCliente() == 1){
                    String c = cli.toString();
                    System.out.println(c); 
                    response.sendRedirect("index.jsp");
                }               
                
            }*/
        } catch (Exception ex) {
            String mensaje = ex.toString();
            request.setAttribute("mensaje", mensaje);
            request.getRequestDispatcher("error.jsp").include(request, response);
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

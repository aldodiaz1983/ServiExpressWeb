/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ClienteDAO;
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author Jonathan
 */
@WebServlet(name = "SRegistroUsuario", urlPatterns = {"/SRegistroUsuario"})
public class SRegistroUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try (PrintWriter out = response.getWriter()) {

            Usuario user = new Usuario();
            Cliente cl = new Cliente();
            UsuarioDAO ud = new UsuarioDAO();
            ClienteDAO cd = new ClienteDAO();

            user.setRut(request.getParameter("rut-user-input"));
            user.setNombre(request.getParameter("nombre-user-input"));
            user.setAppaterno(request.getParameter("appaterno-user-input"));
            user.setApmaterno(request.getParameter("apmaterno-user-input"));
            user.setFechaNac(format.parse(request.getParameter("fecha-user-input")));
            user.setCorreo(request.getParameter("mail-user-input"));
            user.setClave(request.getParameter("pass-user-input"));
            user.setActivo('1');
            user.setTelefono(Long.parseLong(request.getParameter("tel-user-input")));
            user.setRutEmpresa(request.getParameter("empresa-user-input"));
            ud.create(user);

            cl.setUsuarioIdUsuario(ud.findByRut(Usuario.class, user.getRut()));
            cd.create(cl);

            response.sendRedirect("exito-login.jsp");
        } catch (Exception e) {

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

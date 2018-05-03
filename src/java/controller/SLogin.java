package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.GenericType;
import model.*;

/**
 *
 * @author Jonathan
 */
@WebServlet(name = "SLogin", urlPatterns = {"/SLogin"})
public class SLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cl = null;
        Empleado em = null;
        HttpSession session = request.getSession();
        try {
            UsuarioDAO ud;
            ud = new UsuarioDAO();
            String mail = request.getParameter("log-mail");
            String pass = request.getParameter("log-pass");
            Usuario u = ud.login(Usuario.class, mail, pass);
            if (u == null || u.getActivo() == '0') {
                response.sendRedirect("index.jsp");
            } else {
                MarcaDAO md = new MarcaDAO();
                ModeloDAO mod = new ModeloDAO();
                GenericType<List<Marca>> gm = new GenericType<List<Marca>>() {
                };
                List<Marca> listaMarca = (List<Marca>) md.findAll(gm);
                GenericType<List<Modelo>> gt = new GenericType<List<Modelo>>() {
                };
                List<Modelo> listaModelo = (List<Modelo>) mod.findAll(gt);

                ClienteDAO cd = new ClienteDAO();
                cl = cd.findByIDUsuario(Cliente.class, u.getIdUsuario().toString());
                EmpleadoDAO ed = new EmpleadoDAO();
                em = ed.findByIDUsuario(Empleado.class, u.getIdUsuario().toString());

                session.setAttribute("marcas", listaMarca);
                session.setAttribute("modelos", listaModelo);
                session.setAttribute("usuario", u);
            }
        } catch (IOException | ClientErrorException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (cl != null) {
                session.setAttribute("cliente", cl);
                response.sendRedirect("reserva.jsp");
            } else {
                if (em != null) {
                    session.setAttribute("empleado", em);
                    response.sendRedirect("SCrearReserva");
                }
            }
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

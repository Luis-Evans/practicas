package Paquetee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 5IM6 Hernández Marín Miguel Angel, Sánchez López Luis Ignacio
 * @version 1.2 05/09/2017
 */
@WebServlet(name = "Good", urlPatterns = {"/Good"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * 
     * Obtiene los datos proporcionados en el formulario y llama al método que verifica que el
     * usuario y la contraseña sean correctos
     * Si es correcto manda a Welcome.java, si es incorrecto lo notifica y los regresa a index.html
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
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter salida = response.getWriter();

            String user = request.getParameter("user");
            String pass = request.getParameter("password");
            /*
            * Verifica si el usuario y la contraseña son correctos notifica si lo son
            */
            if (Existe.doExist(user, pass)) {
                RequestDispatcher rs = request.getRequestDispatcher("Exis");
                rs.forward(request, response);
            } else {
                /*
                * Sino son correctos lo notifica y redirecciona a la página de inicio index.html
                */
                salida.println("Usuario o contraseña incorrectos");
                RequestDispatcher rs = request.getRequestDispatcher("index.html");
                rs.include(request, response);
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

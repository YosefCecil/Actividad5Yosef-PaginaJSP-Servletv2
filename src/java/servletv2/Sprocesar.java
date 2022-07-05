package servletv2;

import alumnos.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp_Corei7
 */
public class Sprocesar extends HttpServlet {

    private Alumno alumnos[] = new Alumno[10];
    private int cont = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (request.getParameter("btnRegistrar") != null) {
            alumnos[cont] = new Alumno();
            alumnos[cont].setMatricula(request.getParameter("txfMatricula"));
            alumnos[cont].setNombre(request.getParameter("txfNombre"));
            alumnos[cont].setApellidoP(request.getParameter("txfApellidoP"));
            alumnos[cont].setApellidoM(request.getParameter("txfApellidoM"));
            alumnos[cont].setDdi(Integer.parseInt(request.getParameter("txfDDI")));
            alumnos[cont].setDwi(Integer.parseInt(request.getParameter("txfDWI")));
            alumnos[cont].setEcbd(Integer.parseInt(request.getParameter("txfECBD")));

            cont++;

        }

        if (request.getParameter("btnRegistrar") != null) {

            request.setAttribute("alumnos", alumnos);
            request.setAttribute("cont", cont);
            
            RequestDispatcher rd= request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
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

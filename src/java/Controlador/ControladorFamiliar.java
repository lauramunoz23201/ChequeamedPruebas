package Controlador;

import Modelo.Familiar;
import Modelo.FamiliarDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorFamiliar extends HttpServlet {

    FamiliarDAO daofa = new FamiliarDAO();
    Familiar f = new Familiar();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion3 = request.getParameter("accion3");
        switch (accion3) {
            case "Listar":
                List<Familiar> datos3 = daofa.listarFa();
                request.setAttribute("datos3", datos3);
                request.getRequestDispatcher("Listar_familiar.jsp").forward(request, response);
                break;
            case "Mis familiares":
                String idfam = request.getParameter("txtid");
                List<Familiar> datos6 = daofa.listarFa(idfam);
                request.setAttribute("datos6", datos6);
                request.getRequestDispatcher("Listar_familiarid.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("Agregar_familiar.jsp").forward(request, response);
                break;
            case "Agregar":
                String id_usu = request.getParameter("txtiduf");
                String id_pac = request.getParameter("txtidpf");
                String parentesco = request.getParameter("txtparentesco");
                f.setId_usu(id_usu);
                f.setId_pac(id_pac);
                f.setParentesco(parentesco);
                daofa.agregarFa(f);
                request.getRequestDispatcher("Listar_familiar.jsp").forward(request, response);
            default:
                throw new AssertionError();

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

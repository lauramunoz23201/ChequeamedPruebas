package Controlador;

import Modelo.Medicamento;
import Modelo.MedicamentoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorMedicamento extends HttpServlet {

    MedicamentoDAO daom = new MedicamentoDAO();
    Medicamento m = new Medicamento();

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
        String accion2 = request.getParameter("accion2");
        switch (accion2) {
            case "Listar":
                List<Medicamento> datos = daom.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("Listar_medicamento.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("Agregar_medicamento.jsp").forward(request, response);
                break;
            case "Guardar":
                String idm = request.getParameter("txtidm");
                String nomm = request.getParameter("txtnomm");
                String via = request.getParameter("txtvia");
                m.setId_m(idm);
                m.setNom_m(nomm);
                m.setV_admin(via);
                daom.agregar(m);

                request.getRequestDispatcher("Listar_medicamento.jsp").forward(request, response);
                break;
            case "Editar":
                String id = request.getParameter("id");
                Medicamento med = daom.listarId(id);
                request.setAttribute("medicamento", med);
                request.getRequestDispatcher("Editar_medicamento.jsp").forward(request, response);
                break;
            case "Actualizar":
                String idmed = request.getParameter("id");
                String idm1 = request.getParameter("txtid1m");
                String nomm1 = request.getParameter("txtnom1m");
                String via1 = request.getParameter("txtvia1");
                m.setId_m(idm1);
                m.setNom_m(nomm1);
                m.setV_admin(via1);
                daom.actualizar(m);
                request.getRequestDispatcher("ControladorMedicamento?accion2=Listar").forward(request, response);
                break;
            case "Eliminar":
                String iddmed = request.getParameter("id");
                daom.eliminar(iddmed);
                request.getRequestDispatcher("ControladorMedicamento?accion2=Listar").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("ControladorMedicamento?accion2=Listar").forward(request, response);
                
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

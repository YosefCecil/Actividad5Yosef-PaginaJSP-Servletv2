package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import alumnos.Alumno;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    Alumno alumnos[] = new Alumno[10];

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Alumnos. Yosef</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--FORMULARIO---->\n");
      out.write("        <form class=\"form\" method=\"POST\" action=\"Sprocesar\">\n");
      out.write("\n");
      out.write("            <!--TITULO------------------------>\n");
      out.write("            <h1 class=\"titulo\">Registros de Alumnos</h1>\n");
      out.write("\n");
      out.write("            <!--CAJAS-DE-ENTRADA-DE-DATOS------------------------------------------------>\n");
      out.write("            <input class=\"txfMatricula\" name=\"txfMatricula\" type=\"text\" placeholder=\"Matricula\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfNombre\" name=\"txfNombre\" type=\"text\" placeholder=\"Nombre\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfApellidoP\" name=\"txfApellidoP\" type=\"text\" placeholder=\"ApellidoP\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfApellidoM\" name=\"txfApellidoM\" type=\"text\" placeholder=\"ApellidoM\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfDDI\" name=\"txfDDI\" type=\"number\" placeholder=\"DDI\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfDWI\" name=\"txfDWI\" type=\"number\" placeholder=\"DWI\" required maxlength=\"30\">\n");
      out.write("            <input class=\"txfECBD\" name=\"txfECBD\" type=\"number\" placeholder=\"ECBD\" required maxlength=\"30\">\n");
      out.write("            <!--BOTON-DE-REGISTRAR-------------------------->\n");
      out.write("            <input type=\"submit\" class=\"btnRegistrar\" name=\"btnRegistrar\" value=\"REGISTRAR\">\n");
      out.write("        </form> \n");
      out.write("            ");

                if (request.getParameter("btnRegistrar") != null) {
                    int cont = Integer.parseInt(request.getAttribute("cont").toString());
                    alumnos = (Alumno[]) request.getAttribute("alumnos");
                    out.print(""
                            + " <table class=\"table table-responsive table-bordered table-hover table-dark\">"
                            + " <thead>"
                            + "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">"
                            + " <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">"
                            + "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>"
                            + "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>"
                            + "<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>"
                            + " <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>"
                            + " <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js\" integrity=\"sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2\" crossorigin=\"anonymous\"></script>"
                            + "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>"
                            + "<tr>"
                            + "<th>" + "Matricula" + "</th>"
                            + "<th>" + "Nombre completo" + "</th>"
                            + "<th>" + "ddi" + "</th>"
                            + "<th>" + "dwi" + "</th>"
                            + "<th>" + "ecbd" + "</th>"
                            + "<th>" + "Promedio" + "</th>"
                            + "</tr>"
                            + "  </thead>"
                            + " <tbody>");

                    for (int i = 0; i < cont; i++) {
                        out.print("<tr>");
                        out.print("<td>" + alumnos[i].getMatricula() + "</td>");
                        out.print("<td>" + alumnos[i].getNombre() + " " + alumnos[i].getApellidoP() + " " + alumnos[i].getApellidoM() + "</td>");
                        out.print("<td>" + alumnos[i].getDdi() + "</td>");
                        out.print("<td>" + alumnos[i].getDwi() + "</td>");
                        out.print("<td>" + alumnos[i].getEcbd() + "</td>");
                        out.print("<td>" + alumnos[i].getProm() + "</td>");
                        out.print("</tr>");
                    }
                    out.print(""
                            + "   </tbody>"
                            + " </table>");

                }
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

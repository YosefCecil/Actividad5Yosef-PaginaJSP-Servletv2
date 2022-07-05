<%-- 
    Document   : index
    Created on : 3/07/2022, 10:40:08 PM
    Author     : Hp_Corei7
--%>

<%@page import="alumnos.Alumno"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    Alumno alumnos[] = new Alumno[10];
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alumnos. Yosef</title>
        <link rel="stylesheet" href="css/estilos.css">

    </head>
    <body>
        <!--FORMULARIO---->
        <form class="form" method="POST" action="Sprocesar">

            <!--TITULO------------------------>
            <h1 class="titulo">Registros de Alumnos</h1>

            <!--CAJAS-DE-ENTRADA-DE-DATOS------------------------------------------------>
            <input class="txfMatricula" name="txfMatricula" type="text" placeholder="Matricula" required maxlength="30">
            <input class="txfNombre" name="txfNombre" type="text" placeholder="Nombre" required maxlength="30">
            <input class="txfApellidoP" name="txfApellidoP" type="text" placeholder="ApellidoP" required maxlength="30">
            <input class="txfApellidoM" name="txfApellidoM" type="text" placeholder="ApellidoM" required maxlength="30">
            <input class="txfDDI" name="txfDDI" type="number" placeholder="DDI" required maxlength="30">
            <input class="txfDWI" name="txfDWI" type="number" placeholder="DWI" required maxlength="30">
            <input class="txfECBD" name="txfECBD" type="number" placeholder="ECBD" required maxlength="30">
            <!--BOTON-DE-REGISTRAR-------------------------->
            <input type="submit" class="btnRegistrar" name="btnRegistrar" value="REGISTRAR">
        </form> 
            <%
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
            %>
    </body>
</html>

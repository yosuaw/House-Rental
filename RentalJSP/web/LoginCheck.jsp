<%-- 
    Document   : LoginCheck
    Created on : Jun 8, 2021, 11:01:49 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Check</title>
    </head>
    <body>
        <%
            com.rental.peter.Rental_Service service = new com.rental.peter.Rental_Service();
            com.rental.peter.Rental port = service.getRentalPort();

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            String hasil = port.cekLogin(username, password);
            
            if (hasil.equals("sukses")) {
                session.setAttribute("username", username);
                response.sendRedirect("ListRumah.jsp");
            } else {
                response.sendRedirect("LoginErrorPage.jsp");
        }%>
    </body>
</html>

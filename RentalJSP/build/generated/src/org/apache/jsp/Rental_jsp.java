package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Rental_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Rental</h1>\n");
      out.write("            ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	com.rental.peter.Rental_Service service = new com.rental.peter.Rental_Service();
	com.rental.peter.Rental port = service.getRentalPort();
	 // TODO initialize WS operation arguments here
	java.lang.String username = "";
	java.lang.String password = "";
	// TODO process result here
	java.lang.String result = port.cekLogin(username, password);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	com.rental.peter.Rental_Service service = new com.rental.peter.Rental_Service();
	com.rental.peter.Rental port = service.getRentalPort();
	 // TODO initialize WS operation arguments here
	java.lang.String username = "";
	java.lang.String password = "";
	java.lang.String nama = "";
	java.lang.String nomorTelepon = "";
	java.lang.String alamat = "";
	// TODO process result here
	java.lang.String result = port.register(username, password, nama, nomorTelepon, alamat);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("    <form method=\"POST\">\n");
      out.write("            Username = <input type=\"text\" name=\"number1\"/><br><br>\n");
      out.write("            Password = <input type=\"text\" name=\"number2\"/><br><br>\n");
      out.write("            <input type=\"submit\" name=\"login\" value=\"Login\"/>\n");
      out.write("            <input type=\"submit\" name=\"register\" value=\"Register\"/><br><br>\n");
      out.write("        </form>\n");
      out.write("        Result = <input type=\"text\" name=\"result\" value=\"");
      out.print(request.getAttribute("result"));
      out.write("\"/>\n");
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

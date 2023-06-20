package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<title>Homestate &mdash; 100% Free Fully Responsive HTML5 Template by FREEHTML5.co</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta name=\"description\" content=\"Free HTML5 Template by FREEHTML5.CO\" />\n");
      out.write("\t<meta name=\"keywords\" content=\"free html5, free template, free bootstrap, html5, css3, mobile first, responsive\" />\n");
      out.write("\t<meta name=\"author\" content=\"FREEHTML5.CO\" />\n");
      out.write("\n");
      out.write("  <!-- \n");
      out.write("\t//////////////////////////////////////////////////////\n");
      out.write("\n");
      out.write("\tFREE HTML5 TEMPLATE \n");
      out.write("\tDESIGNED & DEVELOPED by FREEHTML5.CO\n");
      out.write("\t\t\n");
      out.write("\tWebsite: \t\thttp://freehtml5.co/\n");
      out.write("\tEmail: \t\t\tinfo@freehtml5.co\n");
      out.write("\tTwitter: \t\thttp://twitter.com/fh5co\n");
      out.write("\tFacebook: \t\thttps://www.facebook.com/fh5co\n");
      out.write("\n");
      out.write("\t//////////////////////////////////////////////////////\n");
      out.write("\t -->\n");
      out.write("\n");
      out.write("  \t<!-- Facebook and Twitter integration -->\n");
      out.write("\t<meta property=\"og:title\" content=\"\"/>\n");
      out.write("\t<meta property=\"og:image\" content=\"\"/>\n");
      out.write("\t<meta property=\"og:url\" content=\"\"/>\n");
      out.write("\t<meta property=\"og:site_name\" content=\"\"/>\n");
      out.write("\t<meta property=\"og:description\" content=\"\"/>\n");
      out.write("\t<meta name=\"twitter:title\" content=\"\" />\n");
      out.write("\t<meta name=\"twitter:image\" content=\"\" />\n");
      out.write("\t<meta name=\"twitter:url\" content=\"\" />\n");
      out.write("\t<meta name=\"twitter:card\" content=\"\" />\n");
      out.write("\n");
      out.write("\t<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("\t\n");
      out.write("\t<!-- Animate.css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("\t<!-- Bootstrap  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t<!-- Superfish -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/superfish.css\">\n");
      out.write("\t<!-- Flexslider  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/flexslider.css\">\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\t<!-- Date Picker -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.min.css\">\n");
      out.write("\t<!-- CS Select -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/cs-select.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/cs-skin-border.css\">\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Modernizr JS -->\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\t<!-- FOR IE9 below -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("    </head>   \n");
      out.write("    <body>\n");
      out.write("        <h1>Home Page</h1>\n");
      out.write("        ");
 String username = session.getAttribute("username").toString();
            request.setAttribute("welcome", username);
      out.write("\n");
      out.write("        <h1>Halo ");
      out.print(request.getAttribute("welcome"));
      out.write(" !</h1><br>\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("        ");

            try {
                com.rental.peter.Rental_Service service = new com.rental.peter.Rental_Service();
                com.rental.peter.Rental port = service.getRentalPort();
                // TODO initialize WS operation arguments here
                request.setAttribute("result", "");
                request.setAttribute("harga", "");
                String operator = request.getParameter("btnReservasi");

                String nama_rumah = request.getParameter("nama_rumah");
                String tanggalMasuk = request.getParameter("tanggal_masuk");
                String tanggalKeluar = request.getParameter("tanggal_keluar");

                String hasil = port.reservasi(tanggalMasuk, tanggalKeluar, username, nama_rumah);

                if (hasil.contains("sukses")) {
                    String[] splitted = hasil.split(":");
                    request.setAttribute("harga", "Harga = Rp. " + splitted[1]);
                    request.setAttribute("result", "Reservasi berhasil!");
                } else {
                    request.setAttribute("result", "Reservasi gagal, tanggal tidak tersedia!");
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("        <div id=\"fh5co-search-map\">\n");
      out.write("\t\t\t<div class=\"search-property\">\n");
      out.write("\t\t\t\t<div class=\"s-holder\">\n");
      out.write("\t\t\t\t\t<h2>Search Properties</h2>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-field\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"from\">Keyword:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"from-place\" placeholder=\"Any\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"class\">Property Status:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"cs-select cs-skin-border\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">Rent</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">Sale</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"class\">Property Type:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"cs-select cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-field\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"from\">Location:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"from-place\" placeholder=\"Any\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"class\">Price:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wide\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"class\">Bedrooms:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wide\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"class\">Bathrooms:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wide\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"class\">Area:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wide\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"class\">Parking spots:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wide\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"cs-select cs-select-half cs-skin-border input-half\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" disabled selected>Any</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Building</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">Office</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xxs-12 col-xs-12 text-center\">\n");
      out.write("\t\t\t\t\t\t\t<p><a class=\"btn btn-primary btn-lg\" href=\"#\">Learn More</a></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"map\" style=\"background-image: url(images/cover_bg_1.jpg);\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("        <form method=\"POST\">\n");
      out.write("            Nama Rumah = <input type=\"text\" name=\"nama_rumah\"/><br><br> \n");
      out.write("            Tanggal Masuk = <input type=\"text\" name=\"tanggal_masuk\" placeholder=\"yyyy-MM-dd\"/><br><br>\n");
      out.write("            Tanggal Keluar = <input type=\"text\" name=\"tanggal_keluar\" placeholder=\"yyyy-MM-dd\"/><br><br>           \n");
      out.write("            <label>");
      out.print(request.getAttribute("result"));
      out.write("</label><br>\n");
      out.write("            <label>");
      out.print(request.getAttribute("harga"));
      out.write("</label><br>\n");
      out.write("            <input type=\"submit\" name=\"btnReservasi\" value=\"Reservasi\"><br><br>\n");
      out.write("        </form>           \n");
      out.write("        <form method=\"post\" action=\"LacakPage.jsp\">\n");
      out.write("            <input type=\"submit\" name=\"btnLacak\" value=\"Lacak\">\n");
      out.write("        </form><br> \n");
      out.write("        <form method=\"post\" action=\"ListRumah.jsp\">\n");
      out.write("            <input type=\"submit\" name=\"btnListRumah\" value=\"List Rumah\">\n");
      out.write("        </form><br>\n");
      out.write("        <form method=\"post\" action=\"LoginPage.jsp\">\n");
      out.write("            <input type=\"submit\" name=\"btnLogout\" value=\"Logout\">\n");
      out.write("        </form> \n");
      out.write("        <!-- jQuery -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<!-- jQuery Easing -->\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- Waypoints -->\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<script src=\"js/sticky.js\"></script>\n");
      out.write("\t<!-- Superfish -->\n");
      out.write("\t<script src=\"js/hoverIntent.js\"></script>\n");
      out.write("\t<script src=\"js/superfish.js\"></script>\n");
      out.write("\t<!-- Flexslider -->\n");
      out.write("\t<script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("\t<!-- Date Picker -->\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("\t<!-- CS Select -->\n");
      out.write("\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t<script src=\"js/selectFx.js\"></script>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- Main JS -->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
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

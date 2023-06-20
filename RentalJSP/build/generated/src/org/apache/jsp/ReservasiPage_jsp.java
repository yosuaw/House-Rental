package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ReservasiPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Reservasi Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"Free HTML5 Template by FREEHTML5.CO\" />\n");
      out.write("        <meta name=\"keywords\" content=\"free html5, free template, free bootstrap, html5, css3, mobile first, responsive\" />\n");
      out.write("        <meta name=\"author\" content=\"FREEHTML5.CO\" />\n");
      out.write("\n");
      out.write("        <!-- \n");
      out.write("              //////////////////////////////////////////////////////\n");
      out.write("      \n");
      out.write("              FREE HTML5 TEMPLATE \n");
      out.write("              DESIGNED & DEVELOPED by FREEHTML5.CO\n");
      out.write("                      \n");
      out.write("              Website: \t\thttp://freehtml5.co/\n");
      out.write("              Email: \t\t\tinfo@freehtml5.co\n");
      out.write("              Twitter: \t\thttp://twitter.com/fh5co\n");
      out.write("              Facebook: \t\thttps://www.facebook.com/fh5co\n");
      out.write("      \n");
      out.write("              //////////////////////////////////////////////////////\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        <!-- Facebook and Twitter integration -->\n");
      out.write("        <meta property=\"og:title\" content=\"\"/>\n");
      out.write("        <meta property=\"og:image\" content=\"\"/>\n");
      out.write("        <meta property=\"og:url\" content=\"\"/>\n");
      out.write("        <meta property=\"og:site_name\" content=\"\"/>\n");
      out.write("        <meta property=\"og:description\" content=\"\"/>\n");
      out.write("        <meta name=\"twitter:title\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:image\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:url\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:card\" content=\"\" />\n");
      out.write("\n");
      out.write("        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- Animate.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- Icomoon Icon Fonts-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("        <!-- Bootstrap  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <!-- Superfish -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/superfish.css\">\n");
      out.write("        <!-- Flexslider  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\">\n");
      out.write("        <!-- Magnific Popup -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <!-- Date Picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.min.css\">\n");
      out.write("        <!-- CS Select -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cs-select.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cs-skin-border.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Modernizr JS -->\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <!-- FOR IE9 below -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>   \n");
      out.write("    <body>\n");
      out.write("        ");
 request.setAttribute("nama", session.getAttribute("username").toString()); 
      out.write("\n");
      out.write("        \n");
      out.write("        <header id=\"fh5co-header-section\" class=\"sticky-banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"nav-header\">\n");
      out.write("                    <a href=\"#\" class=\"js-fh5co-nav-toggle fh5co-nav-toggle dark\"><i></i></a>\n");
      out.write("                    <h1 id=\"fh5co-logo\"><a href=\"index.html\"><i class=\"icon-home\"></i>Home<span>state</span></a></h1>\n");
      out.write("                    <!-- START #fh5co-menu-wrap -->\n");
      out.write("                    <nav id=\"fh5co-menu-wrap\" role=\"navigation\">\n");
      out.write("                        <ul class=\"sf-menu\" id=\"fh5co-primary-menu\">\n");
      out.write("                            <li class=\"active\"><a href=\"ReservasiPage.jsp\">Reservasi</a></li>\n");
      out.write("                            <li><a href=\"ListRumah.jsp\">List Rumah</a></li>\n");
      out.write("                            <li><a href=\"LacakPage.jsp\">Lacak</a></li>\n");
      out.write("                            <li><a>");
      out.print(request.getAttribute("nama"));
      out.write("</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        ");
 String username = session.getAttribute("username").toString();
            request.setAttribute("welcome", username);
      out.write("\n");
      out.write("<!--        <h1>Halo ");
      out.print(request.getAttribute("welcome"));
      out.write(" !</h1><br>-->\n");
      out.write("        ");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"fh5co-search-map\" style=\"background-image: url(images/cover_bg_1.jpg);\">\n");
      out.write("            <div class=\"row animate-box\">\n");
      out.write("                <div class=\"search-property\">\n");
      out.write("                    <div class=\"s-holder\">\n");
      out.write("                        <h2>Reservasi</h2>\n");
      out.write("                        <form method=\"POST\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("                                    <div class=\"input-field\">\n");
      out.write("                                        <label for=\"from\">Nama Rumah:</label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Rumah X Puri Mas\" name=\"nama_rumah\" required/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("                                    <div class=\"input-field\">\n");
      out.write("                                        <label for=\"from\">Tanggal Masuk:</label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"yyyy-MM-dd\" name=\"tanggal_masuk\" required/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xxs-12 col-xs-12\">\n");
      out.write("                                    <div class=\"input-field\">\n");
      out.write("                                        <label for=\"from\">Tanggal Keluar</label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"yyyy-MM-dd\" name=\"tanggal_keluar\" required/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xxs-12 col-xs-12 text-center\">\n");
      out.write("                                    <p><input type=\"submit\" name=\"btnReservasi\" value=\"Reservasi\" class=\"btn btn-primary btn-lg\" href=\"#\"></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label style=\"float: right; position: relative;\">");
      out.print(request.getAttribute("result"));
      out.write("</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer >\n");
      out.write("            <div id=\"footer\" >\n");
      out.write("                <div class=\"container\" >\n");
      out.write("                    <div class=\"row row-bottom-padded-md\" style=\"margin-top: 25px;\">\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <h3 class=\"section-title\">About Homestate</h3>\n");
      out.write("                            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-md-push-1\">\n");
      out.write("                            <h3 class=\"section-title\">Links</h3>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Home</a></li>\n");
      out.write("                                <li><a href=\"#\">Properties</a></li>\n");
      out.write("                                <li><a href=\"#\">Agent</a></li>\n");
      out.write("                                <li><a href=\"#\">Blog</a></li>\n");
      out.write("                                <li><a href=\"#\">API</a></li>\n");
      out.write("                                <li><a href=\"#\">FAQ / Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <h3 class=\"section-title\">Information</h3>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Terms &amp; Condition</a></li>\n");
      out.write("                                <li><a href=\"#\">License</a></li>\n");
      out.write("                                <li><a href=\"#\">Privacy &amp; Policy</a></li>\n");
      out.write("                                <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <h3 class=\"section-title\">Newsletter</h3>\n");
      out.write("                            <p>Subscribe for our newsletter</p>\n");
      out.write("                            <form class=\"form-inline\" id=\"fh5co-header-subscribe\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12 col-md-offset-0\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Enter your email\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-default\"><i class=\"icon-paper-plane\"></i></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <p class=\"fh5co-social-icons\">\n");
      out.write("                                <a href=\"#\"><i class=\"icon-twitter2\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"icon-facebook2\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"icon-instagram\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"icon-dribbble2\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"icon-youtube\"></i></a>\n");
      out.write("                            </p>\n");
      out.write("                            <p>Copyright 2016 Free Html5 <a href=\"#\">Module</a>. All Rights Reserved. <br>Made with <i class=\"icon-heart3\"></i> by <a href=\"http://freehtml5.co/\" target=\"_blank\">Freehtml5.co</a> / Demo Images: <a href=\"https://unsplash.com/\" target=\"_blank\">Unsplash</a> &amp; <a href=\"http://blog.gessato.com/\" target=\"_blank\">Gessato</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!--        <form method=\"post\" action=\"LacakPage.jsp\">\n");
      out.write("                    <input type=\"submit\" name=\"btnLacak\" value=\"Lacak\">\n");
      out.write("                </form><br> \n");
      out.write("                <form method=\"post\" action=\"ListRumah.jsp\">\n");
      out.write("                    <input type=\"submit\" name=\"btnListRumah\" value=\"List Rumah\">\n");
      out.write("                </form><br>\n");
      out.write("                <form method=\"post\" action=\"LoginPage.jsp\">\n");
      out.write("                    <input type=\"submit\" name=\"btnLogout\" value=\"Logout\">\n");
      out.write("                </form> \n");
      out.write("                 jQuery -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- jQuery Easing -->\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"js/sticky.js\"></script>\n");
      out.write("        <!-- Superfish -->\n");
      out.write("        <script src=\"js/hoverIntent.js\"></script>\n");
      out.write("        <script src=\"js/superfish.js\"></script>\n");
      out.write("        <!-- Flexslider -->\n");
      out.write("        <script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("        <!-- Date Picker -->\n");
      out.write("        <script src=\"js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("        <!-- CS Select -->\n");
      out.write("        <script src=\"js/classie.js\"></script>\n");
      out.write("        <script src=\"js/selectFx.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Main JS -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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

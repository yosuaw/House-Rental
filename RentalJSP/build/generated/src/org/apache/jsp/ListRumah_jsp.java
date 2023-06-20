package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListRumah_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>List Rumah Page</title>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            try {
                com.rental.peter.Rental_Service service = new com.rental.peter.Rental_Service();
                com.rental.peter.Rental port = service.getRentalPort();
                // TODO process result here

                String hasil = port.cekListRumah();
                String[] splitted = hasil.split("&");
                String[][] listInfo = new String[6][3];

                listInfo[0] = splitted[0].split(";");
                listInfo[1] = splitted[1].split(";");
                listInfo[2] = splitted[2].split(";");
                listInfo[3] = splitted[3].split(";");
                listInfo[4] = splitted[4].split(";");
                listInfo[5] = splitted[5].split(";");
                
                request.setAttribute("namaRumahBryan", listInfo[0][0]);
                request.setAttribute("namaRumahFelix", listInfo[1][0]);
                request.setAttribute("namaRumahMiftah", listInfo[2][0]);
                request.setAttribute("namaRumahSiti", listInfo[3][0]);
                request.setAttribute("namaRumahWirya", listInfo[4][0]);
                request.setAttribute("namaRumahYosua", listInfo[5][0]);
                
                request.setAttribute("alamat1", listInfo[0][1]);
                request.setAttribute("alamat2", listInfo[1][1]);
                request.setAttribute("alamat3", listInfo[2][1]);
                request.setAttribute("alamat4", listInfo[3][1]);
                request.setAttribute("alamat5", listInfo[4][1]);
                request.setAttribute("alamat6", listInfo[5][1]);
                
                request.setAttribute("harga1", listInfo[0][2]);
                request.setAttribute("harga2", listInfo[1][2]);
                request.setAttribute("harga3", listInfo[2][2]);
                request.setAttribute("harga4", listInfo[3][2]);
                request.setAttribute("harga5", listInfo[4][2]);
                request.setAttribute("harga6", listInfo[5][2]);
                
                

            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"fh5co-wrapper\">\n");
      out.write("            <div id=\"fh5co-page\">\n");
      out.write("                <header id=\"fh5co-header-section\" class=\"sticky-banner\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"nav-header\">\n");
      out.write("                            <a href=\"#\" class=\"js-fh5co-nav-toggle fh5co-nav-toggle dark\"><i></i></a>\n");
      out.write("                            <h1 id=\"fh5co-logo\"><a href=\"index.html\"><i class=\"icon-home\"></i>Home<span>state</span></a></h1>\n");
      out.write("                            <!-- START #fh5co-menu-wrap -->\n");
      out.write("                            <nav id=\"fh5co-menu-wrap\" role=\"navigation\">\n");
      out.write("                                <ul class=\"sf-menu\" id=\"fh5co-primary-menu\">\n");
      out.write("                                    <li><a href=\"ReservasiPage.jsp\">Reservasi</a></li>\n");
      out.write("                                    <li class=\"active\"><a href=\"ListRumah.jsp\">List Rumah</a></li>\n");
      out.write("                                    <li><a href=\"LacakPage.jsp\">Lacak</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-8 col-md-offset-2 text-center heading-section animate-box\"  style=\"margin-top: 30px;\">\n");
      out.write("                            <h3>List Rumah</h3>\n");
      out.write("                            <p>List Rumah yang tersedia pada sistem ini.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 animate-box\">\n");
      out.write("                            <div class=\"property\">\n");
      out.write("                                <a href=\"#\" class=\"fh5co-property\" style=\"background-image: url(images/RumahBryan.jpg);\">\n");
      out.write("                                    <span class=\"status\">Rent</span>\n");
      out.write("                                    <ul class=\"list-details\">\n");
      out.write("                                        <li>2000 ft sq<li>\n");
      out.write("                                        <li>5 Bedroom:</li>\n");
      out.write("                                        <li>4 Bathroom:</li>\n");
      out.write("                                        <li>3 Garage:</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"property-details\">\n");
      out.write("                                    <h3>");
      out.print(request.getAttribute("namaRumahBryan"));
      out.write("</h3>\n");
      out.write("                                    <span class=\"price\">Rp. ");
      out.print(request.getAttribute("harga1"));
      out.write("/hari</span>\n");
      out.write("                                    <p>Desain rumah yang estetik dengan berbagai ruang multifungsi.</p>\n");
      out.write("                                    <span class=\"address\"><i class=\"icon-map\"></i>");
      out.print(request.getAttribute("alamat1"));
      out.write("</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 animate-box\">\n");
      out.write("                            <div class=\"property\">\n");
      out.write("                                <a href=\"#\" class=\"fh5co-property\" style=\"background-image: url(images/RumahFelix.jpg);\">\n");
      out.write("                                    <span class=\"status\">Rent</span>\n");
      out.write("                                    <ul class=\"list-details\">\n");
      out.write("                                        <li>2000 ft sq<li>\n");
      out.write("                                        <li>5 Bedroom:</li>\n");
      out.write("                                        <li>4 Bathroom:</li>\n");
      out.write("                                        <li>3 Garage:</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"property-details\">\n");
      out.write("                                    <h3>");
      out.print(request.getAttribute("namaRumahFelix"));
      out.write("</h3>\n");
      out.write("                                    <span class=\"price\">Rp. ");
      out.print(request.getAttribute("harga2"));
      out.write("/hari</span>\n");
      out.write("                                    <p>Desain rumah yang cukup simpel dengan pencahyaan yang dapat memanjakan mata.</p>\n");
      out.write("                                    <span class=\"address\"><i class=\"icon-map\"></i>");
      out.print(request.getAttribute("alamat2"));
      out.write("</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 animate-box\">\n");
      out.write("                            <div class=\"property\">\n");
      out.write("                                <a href=\"#\" class=\"fh5co-property\" style=\"background-image: url(images/RumahMiftah.jpg);\">\n");
      out.write("                                    <span class=\"status\">Rent</span>\n");
      out.write("                                    <ul class=\"list-details\">\n");
      out.write("                                        <li>2000 ft sq<li>\n");
      out.write("                                        <li>5 Bedroom:</li>\n");
      out.write("                                        <li>4 Bathroom:</li>\n");
      out.write("                                        <li>3 Garage:</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"property-details\">\n");
      out.write("                                    <h3>");
      out.print(request.getAttribute("namaRumahMiftah"));
      out.write("</h3>\n");
      out.write("                                    <span class=\"price\">Rp. ");
      out.print(request.getAttribute("harga3"));
      out.write("/hari</span>\n");
      out.write("                                    <p>Desain rumah yang megah dengan berbagai fasilitas dan tumbuhan yang memberikan kesan asri.</p>\n");
      out.write("                                    <span class=\"address\"><i class=\"icon-map\"></i>");
      out.print(request.getAttribute("alamat3"));
      out.write("</span>\t\t\t\t\t\t\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 animate-box\">\n");
      out.write("                            <div class=\"property\">\n");
      out.write("                                <a href=\"#\" class=\"fh5co-property\" style=\"background-image: url(images/RumahSiti.jpg);\">\n");
      out.write("                                    <span class=\"status\">Rent</span>\n");
      out.write("                                    <ul class=\"list-details\">\n");
      out.write("                                        <li>2000 ft sq<li>\n");
      out.write("                                        <li>5 Bedroom:</li>\n");
      out.write("                                        <li>4 Bathroom:</li>\n");
      out.write("                                        <li>3 Garage:</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"property-details\">\n");
      out.write("                                    <h3>");
      out.print(request.getAttribute("namaRumahSiti"));
      out.write("</h3>\n");
      out.write("                                    <span class=\"price\">Rp. ");
      out.print(request.getAttribute("harga4"));
      out.write("/hari</span>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit est facilis maiores.</p>\n");
      out.write("                                    <span class=\"address\"><i class=\"icon-map\"></i>");
      out.print(request.getAttribute("alamat4"));
      out.write("</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 animate-box\">\n");
      out.write("                            <div class=\"property\">\n");
      out.write("                                <a href=\"#\" class=\"fh5co-property\" style=\"background-image: url(images/RumahWirya.jpg);\">\n");
      out.write("                                    <span class=\"status\">Rent</span>\n");
      out.write("                                    <ul class=\"list-details\">\n");
      out.write("                                        <li>2000 ft sq<li>\n");
      out.write("                                        <li>5 Bedroom:</li>\n");
      out.write("                                        <li>4 Bathroom:</li>\n");
      out.write("                                        <li>3 Garage:</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"property-details\">\n");
      out.write("                                    <h3>");
      out.print(request.getAttribute("namaRumahWirya"));
      out.write("</h3>\n");
      out.write("                                    <span class=\"price\">Rp. ");
      out.print(request.getAttribute("harga5"));
      out.write("/hari</span>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit est facilis maiores.</p>\n");
      out.write("                                    <span class=\"address\"><i class=\"icon-map\"></i>");
      out.print(request.getAttribute("alamat5"));
      out.write("</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 animate-box\">\n");
      out.write("                            <div class=\"property\">\n");
      out.write("                                <a href=\"#\" class=\"fh5co-property\" style=\"background-image: url(images/RumahYosua.jpg);\">\n");
      out.write("                                    <span class=\"status\">Rent</span>\n");
      out.write("                                    <ul class=\"list-details\">\n");
      out.write("                                        <li>2000 ft sq<li>\n");
      out.write("                                        <li>5 Bedroom:</li>\n");
      out.write("                                        <li>4 Bathroom:</li>\n");
      out.write("                                        <li>3 Garage:</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"property-details\">\n");
      out.write("                                    <h3>");
      out.print(request.getAttribute("namaRumahYosua"));
      out.write("</h3>\n");
      out.write("                                    <span class=\"price\">Rp. ");
      out.print(request.getAttribute("harga6"));
      out.write("/hari</span>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit est facilis maiores.</p>\n");
      out.write("                                    <span class=\"address\"><i class=\"icon-map\"></i>");
      out.print(request.getAttribute("alamat6"));
      out.write("</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
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

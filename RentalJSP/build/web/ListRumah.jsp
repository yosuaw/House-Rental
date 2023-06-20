<%-- 
    Document   : ListRumah
    Created on : Jun 4, 2021, 2:48:15 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>List Rumah Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
        <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
        <meta name="author" content="FREEHTML5.CO" />

        <!-- 
              //////////////////////////////////////////////////////
      
              FREE HTML5 TEMPLATE 
              DESIGNED & DEVELOPED by FREEHTML5.CO
                      
              Website: 		http://freehtml5.co/
              Email: 			info@freehtml5.co
              Twitter: 		http://twitter.com/fh5co
              Facebook: 		https://www.facebook.com/fh5co
      
              //////////////////////////////////////////////////////
        -->

        <!-- Facebook and Twitter integration -->
        <meta property="og:title" content=""/>
        <meta property="og:image" content=""/>
        <meta property="og:url" content=""/>
        <meta property="og:site_name" content=""/>
        <meta property="og:description" content=""/>
        <meta name="twitter:title" content="" />
        <meta name="twitter:image" content="" />
        <meta name="twitter:url" content="" />
        <meta name="twitter:card" content="" />

        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="shortcut icon" href="favicon.ico">

        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,300' rel='stylesheet' type='text/css'>

        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">
        <!-- Bootstrap  -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Superfish -->
        <link rel="stylesheet" href="css/superfish.css">
        <!-- Flexslider  -->
        <link rel="stylesheet" href="css/flexslider.css">
        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.css">
        <!-- Date Picker -->
        <link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
        <!-- CS Select -->
        <link rel="stylesheet" href="css/cs-select.css">
        <link rel="stylesheet" href="css/cs-skin-border.css">

        <link rel="stylesheet" href="css/style.css">


        <!-- Modernizr JS -->
        <script src="js/modernizr-2.6.2.min.js"></script>
        <!-- FOR IE9 below -->
        <!--[if lt IE 9]>
        <script src="js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body style="background-color: #f4fcdc;">
        <% request.setAttribute("nama", session.getAttribute("username").toString()); %>

        <%
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
        %>

        <div id="fh5co-wrapper">
            <div id="fh5co-page">
                <header id="fh5co-header-section" class="sticky-banner">
                    <div class="container">
                        <div class="nav-header">
                            <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>
                            <h1 id="fh5co-logo"><i class="icon-home"></i>Anak<span>Rektor</span></h1>
                            <!-- START #fh5co-menu-wrap -->
                            <nav id="fh5co-menu-wrap" role="navigation">
                                <ul class="sf-menu" id="fh5co-primary-menu">
                                    <li class="active"><a href="ListRumah.jsp">List Rumah</a></li>
                                    <li><a href="ReservasiPage.jsp">Reservasi</a></li>
                                    <li><a href="LacakPage.jsp">Lacak</a></li>
                                    <li>
                                        <a class="fh5co-sub-ddown"><%=request.getAttribute("nama")%></a>
                                        <ul class="fh5co-sub-menu">
                                            <li><a href="LoginPage.jsp">Log Out</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </header>

                <div class="container">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2 text-center heading-section animate-box"  style="margin-top: 30px;">
                            <h3>List Rumah</h3>
                            <p>Berikut ini adalah daftar rumah yang kami tawarkan:</p>
                            <p>Klik tombol "Rent?" pada pojok kiri atas gambar rumah untuk mulai melakukan reservasi rumah tersebut.</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4 animate-box">
                            <div class="property">
                                <form method="POST" action="ReservasiPage.jsp">
                                    <a class="fh5co-property" style="background-image: url(images/RumahBryan.jpg);">
                                        <button name="btnRent"><span class="status">Rent?</span></button>
                                        <ul class="list-details">
                                            <li>2000 ft sq<li>
                                            <li>5 Bedroom</li>
                                            <li>3 Bathroom</li>
                                            <li>2 Garage</li>
                                        </ul>
                                    </a>
                                    <div class="property-details">
                                        <h3><%=request.getAttribute("namaRumahBryan")%></h3>
                                        <input name="namaRumah" style="display: none" value="<%=request.getAttribute("namaRumahBryan")%>">
                                        <span class="price">Rp. <%=request.getAttribute("harga1")%>/hari</span>
                                        <p>Desain rumah yang estetik dengan berbagai ruang multifungsi.</p>
                                        <span class="address"><i class="icon-map"></i><%=request.getAttribute("alamat1")%></span>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="col-md-4 animate-box">
                            <div class="property">
                                <form method="POST" action="ReservasiPage.jsp">
                                    <a class="fh5co-property" style="background-image: url(images/RumahFelix.jpg);">
                                        <button name="btnRent"><span class="status">Rent?</span></button>
                                        <ul class="list-details">
                                            <li>1400 ft sq<li>
                                            <li>3 Bedroom</li>
                                            <li>2 Bathroom</li>
                                            <li>1 Garage</li>
                                        </ul>
                                    </a>
                                    <div class="property-details">
                                        <h3><%=request.getAttribute("namaRumahFelix")%></h3>
                                        <input name="namaRumah" style="display: none" value="<%=request.getAttribute("namaRumahFelix")%>">
                                        <span class="price">Rp. <%=request.getAttribute("harga2")%>/hari</span>
                                        <p>Desain rumah yang cukup simpel dengan pencahyaan yang dapat memanjakan mata.</p>
                                        <span class="address"><i class="icon-map"></i><%=request.getAttribute("alamat2")%></span>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="col-md-4 animate-box">
                            <div class="property">
                                <form method="POST" action="ReservasiPage.jsp">
                                    <a class="fh5co-property" style="background-image: url(images/RumahMiftah.jpg);">
                                        <button name="btnRent"><span class="status">Rent?</span></button>
                                        <ul class="list-details">
                                            <li>1800 ft sq<li>
                                            <li>5 Bedroom</li>
                                            <li>4 Bathroom</li>
                                            <li>2 Garage</li>
                                        </ul>
                                    </a>
                                    <div class="property-details">
                                        <h3><%=request.getAttribute("namaRumahMiftah")%></h3>
                                        <input name="namaRumah" style="display: none" value="<%=request.getAttribute("namaRumahMiftah")%>">
                                        <span class="price">Rp. <%=request.getAttribute("harga3")%>/hari</span>
                                        <p>Desain rumah yang megah dengan berbagai fasilitas dan tumbuhan yang memberikan kesan asri.</p>
                                        <span class="address"><i class="icon-map"></i><%=request.getAttribute("alamat3")%></span>						
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="col-md-4 animate-box">
                            <div class="property">
                                <form method="POST" action="ReservasiPage.jsp">
                                    <a class="fh5co-property" style="background-image: url(images/RumahSiti.jpg);">
                                        <button name="btnRent"><span class="status">Rent?</span></button>
                                        <ul class="list-details">
                                            <li>1200 ft sq<li>
                                            <li>3 Bedroom</li>
                                            <li>2 Bathroom</li>
                                            <li>1 Garage</li>
                                        </ul>
                                    </a>
                                    <div class="property-details">
                                        <h3><%=request.getAttribute("namaRumahSiti")%></h3>
                                        <input name="namaRumah" style="display: none" value="<%=request.getAttribute("namaRumahSiti")%>">
                                        <span class="price">Rp. <%=request.getAttribute("harga4")%>/hari</span>
                                        <p>Desain rumah yang modern dengan pohon palam di sebelah kiri.</p>
                                        <span class="address"><i class="icon-map"></i><%=request.getAttribute("alamat4")%></span>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="col-md-4 animate-box">
                            <div class="property">
                                <form method="POST" action="ReservasiPage.jsp">
                                    <a class="fh5co-property" style="background-image: url(images/RumahWirya.jpg);">
                                        <button name="btnRent"><span class="status">Rent?</span></button>
                                        <ul class="list-details">
                                            <li>1300 ft sq<li>
                                            <li>3 Bedroom</li>
                                            <li>3 Bathroom</li>
                                            <li>1 Garage</li>
                                        </ul>
                                    </a>
                                    <div class="property-details">
                                        <h3><%=request.getAttribute("namaRumahWirya")%></h3>
                                        <input name="namaRumah" style="display: none" value="<%=request.getAttribute("namaRumahWirya")%>">
                                        <span class="price">Rp. <%=request.getAttribute("harga5")%>/hari</span>
                                        <p>Desain rumah yang minimalis dan lingkungan yang segar nan asri.</p>
                                        <span class="address"><i class="icon-map"></i><%=request.getAttribute("alamat5")%></span>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="col-md-4 animate-box">
                            <div class="property">
                                <form method="POST" action="ReservasiPage.jsp">
                                    <a class="fh5co-property" style="background-image: url(images/RumahYosua.jpg);">
                                        <button name="btnRent"><span class="status">Rent?</span></button>
                                        <ul class="list-details">
                                            <li>1500 ft sq<li>
                                            <li>4 Bedroom</li>
                                            <li>3 Bathroom</li>
                                            <li>1 Garage</li>
                                        </ul>
                                    </a>
                                    <div class="property-details">
                                        <h3><%=request.getAttribute("namaRumahYosua")%></h3>
                                        <input name="namaRumah" style="display: none" value="<%=request.getAttribute("namaRumahYosua")%>">
                                        <span class="price">Rp. <%=request.getAttribute("harga6")%>/hari</span>
                                        <p>Desain rumah keluarga normal dengan garasi yang tembus pandang.</p>
                                        <span class="address"><i class="icon-map"></i><%=request.getAttribute("alamat6")%></span>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- jQuery -->


        <script src="js/jquery.min.js"></script>
        <!-- jQuery Easing -->
        <script src="js/jquery.easing.1.3.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Waypoints -->
        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/sticky.js"></script>
        <!-- Superfish -->
        <script src="js/hoverIntent.js"></script>
        <script src="js/superfish.js"></script>
        <!-- Flexslider -->
        <script src="js/jquery.flexslider-min.js"></script>
        <!-- Date Picker -->
        <script src="js/bootstrap-datepicker.min.js"></script>
        <!-- CS Select -->
        <script src="js/classie.js"></script>
        <script src="js/selectFx.js"></script>


        <!-- Main JS -->
        <script src="js/main.js"></script>
    </body>
</html>

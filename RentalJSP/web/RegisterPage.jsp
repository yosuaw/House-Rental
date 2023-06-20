<%-- 
    Document   : RegisterPage
    Created on : Jun 2, 2021, 4:38:31 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
    <!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
    <!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
    <!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <title>Registrasi Page</title>
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
        <body>
            <header id="fh5co-header-section" class="sticky-banner">
                <div class="container">
                    <div class="nav-header">
                        <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>
                        <h1 id="fh5co-logo"><i class="icon-home"></i>Anak<span>Rektor</span></h1>
                        <!-- START #fh5co-menu-wrap -->
                        <nav id="fh5co-menu-wrap" role="navigation">
                            <ul class="sf-menu" id="fh5co-primary-menu">
                                <li><a href="LoginPage.jsp">Login</a></li>
                                <li class="active"><a href="RegisterPage.jsp">Registrasi</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </header>

            <%-- start web service invocation --%>
            <%
                try {
                    com.rental.peter.Rental_Service service = new com.rental.peter.Rental_Service();
                    com.rental.peter.Rental port = service.getRentalPort();
                    // TODO initialize WS operation arguments here
                    request.setAttribute("result", "");
                    String operator = request.getParameter("btnRegister");
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    String nama = request.getParameter("nama");
                    String no_telp = request.getParameter("no_telp");
                    String alamat = request.getParameter("alamat");

                    String hasil = "";
                    if (operator.equals("Register")) {
                        hasil = port.register(username, password, nama, no_telp, alamat);
                    }

                    if (hasil.equals("sukses")) {
                        request.setAttribute("result", "Registrasi berhasil!");
                    } else {
                        request.setAttribute("result", "Registrasi gagal, username tidak tersedia!");
                    }

                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
            %>
            <%-- end web service invocation --%>

            <div id="fh5co-search-map" class="map" style="background-image: url(images/cover_bg_1.jpg);">
                <div class="animate-box">
                    <div class="search-property">
                        <div class="s-holder">
                            <h2>Registrasi</h2>
                            <div class="row">                 
                                <form method="POST">
                                    <div class="col-xxs-12 col-xs-12">
                                        <div class="input-field">
                                            <label for="from">Username:</label>
                                            <input type="text" id="from-place" placeholder="johndoe1234" name="username"  required/>
                                        </div>
                                    </div>
                                    <div class="col-xxs-12 col-xs-12">
                                        <div class="input-field">
                                            <label for="from">Password:</label>
                                            <input type="password" id="from-place"  name="password"  required/>
                                        </div>
                                    </div>
                                    <div class="col-xxs-12 col-xs-12">
                                        <div class="input-field">
                                            <label for="from">Nama:</label>
                                            <input type="text" id="from-place" placeholder="John Doe"  name="nama" required/>
                                        </div>
                                    </div>
                                    <div class="col-xxs-12 col-xs-12">
                                        <div class="input-field">
                                            <label for="from">No Telepon:</label>
                                            <input type="text" id="from-place" placeholder="012312312"  name="no_telp" required/>
                                        </div>
                                    </div>
                                    <div class="col-xxs-12 col-xs-12"> 
                                        <div class="input-field">
                                            <label for="from">Alamat:</label>
                                            <input type="text" id="from-place" placeholder="Jalan Mawar"  name="alamat" required/>
                                        </div>
                                    </div>
                                    <div class="col-xxs-12 col-xs-12 text-center">
                                        <p><input type="submit" name="btnRegister" value="Register" class="btn btn-primary btn-lg" required></p>
                                    </div>
                                    <!--                                    <div class="col-xxs-12 col-xs-12 text-center">
                                                                            <p><input type="submit" name="btnBack" value="Back" class="btn btn-primary btn-lg" href="LoginPage.jsp"></p?
                                                                        </div>-->
                                    <div>
                                        <label style="float: right; position: relative;"><%=request.getAttribute("result")%></label>
                                    </div>
                                </form>
                            </div>   
                        </div>                      
                    </div>
                </div>
            </div>

            <footer >
                <div id="footer" >
                    <div class="container" >
                        <div class="row row-bottom-padded-md" style="margin-top: 25px;">
                            <div class="col-md-3">
                                <h3 class="section-title">About AnakRektor</h3>
                                <p>Sebuah kelompok sederhana beranggotakan 3 orang mahasiswa yang ingin membanggakan orang tuanya.</p>
                            </div>

                            <div class="col-md-3 col-md-push-1">
                                <h3 class="section-title">Links</h3>
                                <ul>
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">Properties</a></li>
                                    <li><a href="#">Agent</a></li>
                                    <li><a href="#">Blog</a></li>
                                    <li><a href="#">API</a></li>
                                    <li><a href="#">FAQ / Contact</a></li>
                                </ul>
                            </div>

                            <div class="col-md-3">
                                <h3 class="section-title">Information</h3>
                                <ul>
                                    <li><a href="#">Terms &amp; Condition</a></li>
                                    <li><a href="#">License</a></li>
                                    <li><a href="#">Privacy &amp; Policy</a></li>
                                    <li><a href="#">Contact Us</a></li>
                                </ul>
                            </div>
                            <div class="col-md-3">
                                <h3 class="section-title">Newsletter</h3>
                                <p>Subscribe for our newsletter</p>
                                <form class="form-inline" id="fh5co-header-subscribe">
                                    <div class="row">
                                        <div class="col-md-12 col-md-offset-0">
                                            <div class="form-group">
                                                <input type="text" class="form-control" id="email" placeholder="Enter your email">
                                                <button type="submit" class="btn btn-default"><i class="icon-paper-plane"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <p class="fh5co-social-icons">
                                    <a href="#"><i class="icon-twitter2"></i></a>
                                    <a href="#"><i class="icon-facebook2"></i></a>
                                    <a href="#"><i class="icon-instagram"></i></a>
                                    <a href="#"><i class="icon-dribbble2"></i></a>
                                    <a href="#"><i class="icon-youtube"></i></a>
                                </p>
                                <p>Copyright 2016 Free Html5 <a href="#">Module</a>. All Rights Reserved. <br>Made with <i class="icon-heart3"></i> by <a href="http://freehtml5.co/" target="_blank">Freehtml5.co</a> / Demo Images: <a href="https://unsplash.com/" target="_blank">Unsplash</a> &amp; <a href="http://blog.gessato.com/" target="_blank">Gessato</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
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

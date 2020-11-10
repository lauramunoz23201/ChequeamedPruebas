<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Editar cuenta</title>
        <link rel="icon" href="images/favicon.ico" type="image/x-icon">
        <link rel="icon" type="image/png" sizes="16x16" href="images/favicon-96x96.png">
        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">

        <!-- Bootstrap  -->
        <link rel="stylesheet" href="css/bootstrap.css">

        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.css">

        <!-- Theme style  -->
        <link rel="stylesheet" href="css/style.css">

        <!-- Modernizr JS -->
        <script src="js/modernizr-2.6.2.min.js"></script>

        <style>
            #barra {
                position: fixed;
                padding-bottom: 10px;
            }

            #form-lora {
                margin: auto;
                width: 150%;
                height: 710px;
                max-width: 900px;
                max-height: 1000px;
                background: #3dcdbc;
                border-radius: 10px;

            }
            .form-title2 {
                background: #33a2bd;
                padding: 20px;
                text-align: center;
                border-bottom: 5px solid white;
                font-family: sans-serif;
                color: white;
            }

            #inputs2 {
                margin-bottom: 15px;
                padding: 15px;
                font-size: 16px;
                border-radius: 3px;
                border: 1px solid orange;
                border: none;
                outline: none;
                border-bottom: 2px solid white;
                color: #fff;
                font-family: sans-serif;
                background: #33a2bd;
            }

            .btn-submit2 {
                color: #fff;
                font-family: sans-serif;
                margin: auto;
                padding: 10px 40px;
                font-size: 17px;
                transition: all .3s ease;
                cursor: pointer;
                background: #154360;
                border: none;
                outline: none;
            }

            .btn-submit2:hover {
                background: #f29718;
                border: groove darkgoldenrod;
            }
        </style>


    </head>

    <body>

        <div class="gtco-loader"></div>

        <div id="page">

            <nav class="gtco-nav" role="navigation" id="barra">
                <div class="gtco-container">

                    <div class="row">
                        <div class="col-sm-2 col-xs-12">
                            <div id="gtco-logo">
                                <a href="index.jsp"><img style="border-radius: 80px" src="images/LogoChe.jpg" alt="Logo" width="50px"></a>
                            </div>
                        </div>
                        <div class="col-xs-10 text-right menu-1">
                            <ul>
                                <li><a href="index.jsp">Inicio</a></li>
                                <li><a href="maestras.jsp">Volver</a></li>
                            </ul>
                        </div>
                    </div>

                </div>
            </nav>

            <header id="gtco-header" class="gtco-cover gtco-cover-xs gtco-inner" role="banner" style="height: 300px">
                <div class="gtco-container">
                    <div class="row">
                        <div class="col-md-12 col-md-offset-0 text-left">
                            <div class="display-t">
                                <div class="display-tc">
                                    <div class="row">
                                        <div class="col-md-8 animate-box">
                                            <h1 class="no-margin" style="position: relative; bottom: 80px; left: 40px;"><strong>Editar</strong></h1>
                                            <h3 style="color: white; position: relative; bottom: 70px; left: 40px;">Podrás editar todo tipo de cuenta.</h3>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <div class="espacio">
                <h3 class="espacio">Completa todos los campos</h3>
            </div>
            <form id="form-lora" action="ControladorPaciente" method="POST">
                <h2 class="form-title2">Editar Paciente</h2>
                <div class="contenedor-inputs">
                    <input type="text" id="inputs2" class="form-input" required name="txtid1p" value="${datos1.getId_p()}">

                    <input type="text" id="inputs2" class="form-input" required name="txtnom1p" value="${datos1.getNom_p()}">

                    <input type="text" id="inputs2" class="input-48" required name="txtpri_ape1p" value="${datos1.getPri_ape_p()}">

                    <input type="text" id="inputs2" class="input-48" required name="txtseg_ape1p" value="${datos1.getSeg_ape_p()}">
                    <select name="txtsexo1p" id="inputs2" class="form-input" required value="${datos1.getSexo()}">
                        <option disabled selected>Selecciona un sexo</option>
                        <option value="1">Femenino</option> 
                        <option value="2">Masculino</option>
                    </select>
                        <input type="hidden" name="id" value="${datos1.getId_p()}">
                    <input type="submit" class="btn-submit2" name="accion1" value="Actualizar" >
                </div>
            </form>
            <br>
            <div class="espacio">
                <h3 class="espacio">...</h3>
            </div>



            <!-- jQuery -->
            <script src="js/jquery.min.js"></script>
            <!-- jQuery Easing -->
            <script src="js/jquery.easing.1.3.js"></script>
            <!-- Bootstrap -->
            <script src="js/bootstrap.min.js"></script>
            <!-- Waypoints -->
            <script src="js/jquery.waypoints.min.js"></script>
            <!-- Carousel -->
            <script src="js/owl.carousel.min.js"></script>
            <!-- Magnific Popup -->
            <script src="js/jquery.magnific-popup.min.js"></script>
            <script src="js/magnific-popup-options.js"></script>
            <!-- Main -->
            <script src="js/main.js"></script>

    </body>
</html>

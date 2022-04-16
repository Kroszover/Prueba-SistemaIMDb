<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Show</title>
    <link rel="stylesheet" href="/assets/css/Homestyle1.css">
    <link rel="stylesheet" href="/assets/css/show.css">
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Open+Sans:wght@400;600&display=swap" rel="stylesheet"> 
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
    <header>
		<div class="contenedor">
			<h2 class="logotipo">NewFlix</h2>
			<nav>
				<a href="#" class="activo">Inicio</a>
				<a href="/show.html">TV Shows</a>
				<a href="/login.html">Login</a>
				<a href="/registration.html">Registrarse</a>
			</nav>
		</div>
	</header>
    <main>
    <div class="container">
        <div class="row">
            <div class="span6">
                <table class="table">
                      <thead>
                      <tr>
                          <th>Nombre Pelicula o Serie</th>
                          <th>Network</th>
                          <th>Usuario</th>
                          <th>Comment</th>
                          <th>Ranking</th>                                          
                      </tr>
                  </thead>   
                  <tbody>
                   
                    <tr>
                        <td>The Witcher</td>
                        <td>1</td>
                        <td>Noobmaster123</td>
                        <td>Serie basada en la saga de libros de andrzej sapkowski</td>
                        <td><div class="reviewStars">
                            <span data-rating="1"><i class="far fa-star"></i></span>
                            <span data-rating="2"><i class="far fa-star"></i></span>
                            <span data-rating="3"><i class="far fa-star"></i></span>
                            <span data-rating="4"><i class="far fa-star"></i></span>
                            <span data-rating="5"><i class="far fa-star"></i></span>
                        </div></td>
                        <td><span class="label label-success">Active</span></td>                                        
                    </tr>  
                    <tr>
                        <td>Interstellar</td>
                        <td>2</td>
                        <td>moodRookie123</td>
                        <td>Serie del espacio sumamente larga</td>
                        <td><div class="reviewStars">
                            <span data-rating="1"><i class="far fa-star"></i></span>
                            <span data-rating="2"><i class="far fa-star"></i></span>
                            <span data-rating="3"><i class="far fa-star"></i></span>
                            <span data-rating="4"><i class="far fa-star"></i></span>
                            <span data-rating="5"><i class="far fa-star"></i></span>
                        </div></td>
                        <td><span class="label label-success">Active</span></td>                                        
                    </tr>                                  
                  </tbody>
                </table>
                </div>
        </div>
    </div>
</main>
     
      <script src="/assets/js/edit.js"></script>
      <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/assets/css/stilologin.css">
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Open+Sans:wght@400;600&display=swap" rel="stylesheet"> 
</head>
<body>
    
    <div class="form">
        <div class="title">Bienvenido a NewFlix</div>
        <div class="subtitle">Vamos a crear tu cuenta!</div>
        <div class="input-container ic1">
          <input id="username" class="input" type="text" placeholder=" " />
          <div class="cut"></div>
          <label for="username" class="placeholder">Username</label>
        </div>
        <div class="input-container ic2">
          <input id="email" class="input" type="text" placeholder=" " />
          <div class="cut"></div>
          <label for="email" class="placeholder">Email</label>
        </div>
        <div class="input-container ic2">
          <input id="password" class="input" type="text" placeholder=" " />
          <div class="cut cut-short"></div>
          <label for="password" class="placeholder">Password</>
        </div>
        <div class="input-container ic2">
            <input id="passwordconfirmacion" class="input" type="text" placeholder=" " />
            <div class="cut cut-short"></div>
            <label for="passwordconfirmacion" class="placeholder">Password Confirmation</>
          </div>
        <button type="text" class="submit">Ingresar</button>
      </div>
</body>
</html>
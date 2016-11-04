<%-- 
    Document   : cadastroprofessor
    Created on : 22/10/2016, 10:43:25
    Author     : Itanir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="windth=device-width, initial-scale=1">
        <link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap-3.3.7-dist/css/bootstrap.theme.min.css" rel="stylesheet">
          <title>Cadastro de Professor</title>
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <h1> Cadastro de Professor(a) </h1>
                <form action="servlet" method="post">
                    <div class="col-sm-5"
                         <div class="panel panel-default">
                             <div class="panel-body">
                                 <div class="form-group">
                                     <label for="aluno"> Nome do Professor(a)</label>
                                     <input type="text" class="form-control" id="aluno" name="aluno">
                                 </div>
                                 <div class="form-group">
                                     <label for="sexo"> Sexo: </label>
                                     <input type="radio" name= "radio" >Masculino
                                     <input type="radio" name= "radio" >Feminino
                                 </div>
                                 <input type="submit" class="btn btn-default" value="Salva"> 
                                 <input type="submit" class="btn btn-default" value="Editar"> 
                             </div>
                        </div>
                </form>
            </div>
    </body>
</html>

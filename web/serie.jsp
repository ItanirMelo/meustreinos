<%-- 
    Document   : cadastroAluno
    Created on : 22/10/2016, 09:08:28
    Author     : Itanir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="windth=device-width, initial-scale=1">
        <!-- bootstrap core css -->
        <link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- bootstrap theme -->
        <link href="bootstrap-3.3.7-dist/css/bootstrap.theme.min.css" rel="stylesheet">
          <title>Cadastro de Serie</title>
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <h1> Cadastro de Serie </h1>
                <form action="servlet" method="post">
                    <div class="col-sm-5"
                         <div class="panel panel-default">
                             <div class="panel-body">
                                 <div class="form-group">
                                     <label for="desc_serie"> Descrição da Serie</label>
                                     <input type="text" class="form-control" id="desc_serie" name="desc_serie">
                                 </div>
                                 <div>
                                 <label for="aparelho"> Aparelho</label>
                                     <input type="text" class="form-control" id="aparelho" name="aparelho">
                                 </div>
                             <div>
                             <label for="musculo"> Musculos</label>
                                     <input type="text" class="form-control" id="musculo" name="musculo">
                                 </div>
                         <div>
                                 <label for="repeticao"> Quantidade de repetições</label>
                                     <input type="text" class="form-control" id="repeticao" name="repeticao">
                                 </div>
                                 <input type="submit" class="btn btn-default" value="Salvar">
                                 <input type="submit" class="btn btn-default" value="Editar">
                                 <input type="submit" class="btn btn-default" value="Excluir">
                             </div>
                        </div>
                </form>
            </div>
    </body>
</html>
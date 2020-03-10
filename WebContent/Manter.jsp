<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    		 



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
 <link href="css/style.default.css" rel="stylesheet">
        <link href="css/morris.css" rel="stylesheet">
        <link href="css/select2.css" rel="stylesheet" />
</head>
<body>

<div class="contentpanel">
    <form id="basicForm" action="./UserController" method="post">  			
    <input type="hidden" name="idUser" value="${userlist.id}"/> 			
     <div class="panel panel-default">
<div class="panel-heading">

                                <h4 class="panel-title">Formulário para cadastro de Users</h4>
                                <p>Preencha os dados solicitados abaixo. Ou clique <a href="index.jsp" title="Retornar"> aqui </a> para retornar.</p>
                               
                            </div><!-- panel-heading -->
                            <div class="panel-body">
                                <div class="row">
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Id <span class="asterisk">*</span></label>
                                        <div class="col-sm-9">
                                  																		  
                                            <input type="text" name="id" class="form-control" placeholder="Digite um codigo.." value="${userlist.id}" required />
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Nome <span class="asterisk">*</span></label>
                                        <div class="col-sm-9">
        												
                                            <input type="text" name=name class="form-control" placeholder="Digite um nome..." value="${userlist.name}" required />
                                        </div>
                                       <label class="col-sm-3 control-label">Email <span class="asterisk">*</span></label>
                                        <div class="col-sm-9">
        																			
                                            <input type="email" name="email" class="form-control" placeholder="Digite um email.." value="${userlist.email}" required />
                                       </div>
                                        <div class="form-group">
                                        <label class="col-sm-3 control-label">Sexo <span class="asterisk">*</span></label>
                                        <div class="col-sm-9">
                                            <input type="text" name="sex" class="form-control" placeholder="Digite uma sexo.." value="${userlist.sex}" required />
                                        </div>
                                    </div>
                                   <div class="form-group">
                                        <label class="col-sm-3 control-label">País <span class="asterisk">*</span></label>
                                        <div class="col-sm-9">
                                            <input type="text" name="country" class="form-control" placeholder="Digite um país.." value="${userlist.country}" required />
                                        </div>
                                    </div>
                                        <div class="form-group">
                                        <label class="col-sm-3 control-label">Senha <span class="asterisk">*</span></label>
                                        <div class="col-sm-9">
                                            <input type="password" name="password" class="form-control" placeholder="Digite uma senha.." value="${userlist.password}" required />
                                        </div>
                                    </div>
                                       
                                       
                                       
                                       
                                       
  <div class="col-sm-9 col-sm-offset-3">
     <button type="submit" class="btn btn-primary mr10">Salvar</button>    
     <button type="reset" class="btn btn-dark mr10">Limpar</button>
  </div>                                
                                       
</body>
</html>
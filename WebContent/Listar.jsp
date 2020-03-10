<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  			 
 
<jsp:useBean id="user" class="view.userview"/>				


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LISTANDO</title>
 <link href="css/style.default.css" rel="stylesheet">
        <link href="css/morris.css" rel="stylesheet">
        <link href="css/select2.css" rel="stylesheet" />
</head>
<body>
 <div class="table-responsive">
 
 
                        	  <a href="./UserController?acao=inserir" data-toggle="tooltip" title="Novo" class="tooltips">
							   <i class="fa fa-plus"></i> <span>Novo</span> </a>   
																					

                        <table class="table mb30 table-hover" border="1" whidth=100%>
                            <thead>
                                <tr>
                                    <th></th>   
                                    <th>Id</th>
                                    <th>Nome</th>
                                    <th>Email</th>
                                    <th>Sexo</th>
                                    <th>País</th>
                                    <th>Senha</th>
                                    
                                </tr>
                            </thead>
                            <tbody>
                          		 
								    <c:forEach var="u" items="${user.user}"> 	   
  																				
                                    <tr>
                                        <td class="table-action">
	                           		 
                                           <a href="./UserController?acao=editar&id=${u.id}" data-toggle="tooltip" title="Editar" class="tooltips"> <i class="fa fa-pencil"></i> </a>  <br/>
                                                
                                           <a href="./UserController?acao=deletar&id=${u.id}" data-toggle="tooltip" title="Deletar" class="delete-row tooltips"> <i class="fa fa-trash-o"></i></a>
                                        </td>
										<td><c:out value="${u.id}"/> </td> 
                                        <td><c:out value="${u.name}"/></td>
                                        <td><c:out value="${u.email}"/></td>
                                        <td><c:out value="${u.sex}"/></td>
                                        <td><c:out value="${u.country}"/></td>
                                        <td><c:out value="${u.password}"/></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>

</body>
</html>
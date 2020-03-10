package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDAO;


  
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})  
public class UserController extends HttpServlet {


    private UserDAO metodos; 	
    
    
    public static final String LIST = "Listar.jsp"; 		  
    public static final String INSERT_OR_EDIT = "Manter.jsp"; 
  
    
    public UserController() {
        super();  
        metodos = new UserDAO();
    }  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	
    	 response.setContentType("text/html;charset=UTF-8");
         String forward = "";
         String acao = request.getParameter("acao");
              
         
         try {
         	
             if (acao.equalsIgnoreCase("deletar")) {  		
            	 String i =  request.getParameter("id");
                 int id = Integer.parseInt(i);
                 forward = LIST;
                 metodos.excluir(id);
                 request.setAttribute("userlist", metodos.consultar());
             } 
             
             else if (acao.equalsIgnoreCase("editar")) { 	
                 forward = INSERT_OR_EDIT;
                 String z = (request.getParameter("id"));
                 int id = Integer.parseInt(z);
                 User user = metodos.consultar(id);        
                 request.setAttribute("userlist", user);    
             } 
             
             else if (acao.equalsIgnoreCase("inserir")) {  
            	 forward = INSERT_OR_EDIT;                  
             
            	 
             } else {
                 forward = LIST;
                 request.setAttribute("userlist", metodos.consultar()); 
               }
                    
             
         } catch (Exception e) {
             e.printStackTrace();
         }

         RequestDispatcher view = request.getRequestDispatcher(forward);
         view.forward(request, response);
    
    }
  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    	
    	
        String i = request.getParameter("id");
        int id = Integer.parseInt(i);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String sex = request.getParameter("sex");
        String country = request.getParameter("country");
        String password = request.getParameter("password");
        
        
        String idUser = request.getParameter("idUser"); 	
        
       
        System.out.println("CODIGO: " + id);
        System.out.println("NOME: " + name);
        System.out.println("EMAIL: " + email);
        System.out.println("SEXO: " + sex);
        System.out.println("PAIS: " + country);
        System.out.println("SENHA: " + password);

        
        
        if (idUser == null) {  
        	idUser = "";  
        }

        System.out.println("Concluido!");
        
        User e = null; 
        String forward = LIST; 
        try {
        	
        	
            if (idUser.trim().isEmpty()) { 
                e = new User();        
                e.setId(id);
                e.setName(name);
                e.setEmail(email);
                e.setSex(sex);
                e.setCountry(country);
                e.setPassword(password);  
                metodos.cadastrar(e);
            	}
            
           
            else {
                e = metodos.consultar(id); 
                e.setName(name);
                e.setId(id);
                e.setName(name);
                e.setEmail(email);
                e.setSex(sex);
                e.setCountry(country);
                e.setPassword(password);
                metodos.alterar(e);
              
            }
           
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

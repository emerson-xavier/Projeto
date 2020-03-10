package view;

import java.util.List;

import model.User;
import model.UserDAO;

public class userview {

	
	
public List<User> getUser() throws Exception {                
		
        List<User> list = null;
        try {
            list = (new UserDAO()).consultar();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao consultar Usuarios!");
        }
        return list;
    }
		
	   public void cadastrar(User u) throws Exception {
        try {
           
            new UserDAO().cadastrar(u);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao cadastrar Usuario!");
        }
    }

    public void excluir(User u) throws Exception {
        try {
            new UserDAO().excluir(u);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao excluir Usuario!");
        }
    }


    public void excluir(int  id) throws Exception {
        try {
            new UserDAO().excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao excluir Usuario!");
        }
    }

    public void alterar(User u) throws Exception {
        try {
            new UserDAO().alterar(u);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao alterar Usuario!");
        }
    }


    public User consultarPeloCodigo(int id) throws Exception {
        try {
            User f = new UserDAO().consultar(id);
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao consultar Usuario!");
        }
    }
	
}

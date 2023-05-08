
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class ConectaBanco {
    
    public static String caminho="jdbc:postgresql://localhost:5432/BancoUsuario";
    public static String user="postgres";
    public static String senha="7654321";
    
    public static Connection con;
    
    public static Connection MetodoConexao()
    {
        try {
            Class.forName("org.postgresql.Drive");
            System.out.println("Conectou com o Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não conectou com o Driver");
        }
        
         
        
        
        return con;
    }
    
  
    
}

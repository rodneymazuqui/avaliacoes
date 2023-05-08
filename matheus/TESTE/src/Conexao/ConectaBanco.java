/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class ConectaBanco {
    
    public static String caminho = "";
    public static String usuario = "matheus";
    public static String senha = "123";
    public static Connection con;
    
    public static Connection MetodoConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(caminho,usuario,senha);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
    
    
    //PROFESSOR, NAO ESTA CONECTANDO A CONEXAO DO MEU BANCO DE DADOS, FIZ NO XAMPP!!
    
    
    
}

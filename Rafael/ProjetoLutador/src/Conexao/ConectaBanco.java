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
    
   public static String caminho="jdbc:mysql://localhost:3306/rafael?zeroDateTimeBehavior=convertToNull";
   public static String usuario = "mysql";
   public static String senha="123456";
 
   public static Connection con;
   public static Connection MetodoConnection(){
       
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
       }
          
     
       try {
           con=DriverManager.getConnection(usuario);
       } catch (SQLException ex) {
           Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
       }
    
   
     
          return con;
            
   }
   
}

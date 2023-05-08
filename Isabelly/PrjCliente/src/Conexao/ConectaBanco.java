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
            
    public static String caminho = "jdbc:postgresql://localhost:5432/postgres";
    public static String nome = "";
    public static String rg = "";
    public static String idade = "";
    public static Connection con;
    
    public static Connection MetodoConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectou o Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Falhou");
        }
        try {
            con = DriverManager.getConnection(caminho,nome,rg,idade);
            System.out.println("Conectou");
        } 
        catch (SQLException ex) {
            System.out.println("Falhou");
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
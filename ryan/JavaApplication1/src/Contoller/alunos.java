/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.sql.Connection;

/**
 *
 * @author Aluno
 */
public class alunos {
    
    public static String caminho="";
    public static String usuario="";
    public static String senha="";
    public static Connection con;
    
    public static Connection MetodoConexao() throws ClassNotFoundException
    {
        
        
        
        Class.forName("org.postgresql.Driver");
        return con;
        
        
        
        
    }
    
}

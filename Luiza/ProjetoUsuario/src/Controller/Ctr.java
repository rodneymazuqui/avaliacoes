/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;

/**
 *
 * @author Aluno
 */
public class Ctr {
    
    public void Cadastrar(FrmUsuario f){
    
      obj usuario= new usuario;
      
      PreparedStatement ps;
      
      String sql="insert into usuario (login,senha,idade) values (?, ?, ?)";
      
        
        
}
   
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.FrmFuncionario;

/**
 *
 * @author Aluno
 */
public class CtrFUncionario {
    public void cadastrar(FrmFuncionario f){
        Connection con;
        PreparedStatement ps;
        
        String sql = "insert into funcionarios value (?,?,?)";
        
        }
    }


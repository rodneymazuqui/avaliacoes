/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectaBanco;
import Model.cliente;
import View.FrmCadCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class CtrCliente {
    public void Cadastrar(FrmCadCliente f) {
        Connection con;
        PreparedStatement ps;
        con = ConectaBanco.MetodoConexao();
        
        cliente obj = new cliente();
        obj.nome = f.txtNome.getText();
        obj.rg = f.txtIdade.getText();
        obj.idade = f.txtIdade.getText();

        try {
            ps = con.prepareStatement(sql);
            ps = ps.setString(1, obj.nome);
            ps = ps.setString(2, obj.rg);
            ps = ps.setString(3, obj.idade);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.FrmCadastroLutador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class CtrLutador {
    public void cadastrar (FrmCadastroLutador f ){
       Connection con;
        PreparedStatement ps = null;
        try {
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CtrLutador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}

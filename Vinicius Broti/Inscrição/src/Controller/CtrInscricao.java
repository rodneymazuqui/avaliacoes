/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Inscricao;
import javax.swing.JOptionPane;
import view.FrmCadInscricao;

/**
 *
 * @author Aluno
 */
public class CtrInscricao {
    
    public void Cadastrar(FrmCadInscricao f)
    {
        Inscricao objP = new Inscricao();
        objP.nome = f.txtNome.getText();
        objP.mod =f.txtMod.getText();
        objP.idade=f.txtIdade.getText();
        JOptionPane.showMessageDialog(null, objP.nome + "\n" +objP.mod + "\n" +objP.idade);
        
    }    
}

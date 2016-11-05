/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.AlunoDao;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

/**
 *
 * @author Itanir
 */
public class AlunoImpl implements AlunoDao<Aluno> {

    public static void salvar(servlet.Aluno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void salvar(Aluno a) {
    }

    public List listarTodos() {
        List<Aluno> list = new ArrayList<>();
        
        
        return list;
    }

    @Override
    public void alterar(Aluno a) {
    }

    @Override
    public void remover(Aluno a) {
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ProfessorDao;
import java.util.ArrayList;
import java.util.List;
import model.Professor;

/**
 *
 * @author Itanir
 */
public class ProfessorImpl implements ProfessorDao<Professor> {

    @Override
    public void salvar(Professor p) {
    }

    @Override
    public List listarTodos() {
        List<Professor> list = new ArrayList<>();
        
        
        return list;
    }

    @Override
    public void alterar(Professor p) {
    }

    @Override
    public void remover(Professor p) {
    }
    
}

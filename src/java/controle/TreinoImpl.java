/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.TreinoDao;
import java.util.ArrayList;
import java.util.List;
import model.Treino;

/**
 *
 * @author Itanir
 */
public class TreinoImpl implements TreinoDao<Treino> {

    @Override
    public void salvar(Treino tr) {
    }

    @Override
    public List listarTodos() {
        List<Treino> list = new ArrayList<>();
        
        
        return list;
    }

    @Override
    public void alterar(Treino tr) {
    }

    @Override
    public void remover(Treino tr) {
    }
    
}

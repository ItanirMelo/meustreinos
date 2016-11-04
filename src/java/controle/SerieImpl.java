/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.SerieDao;
import java.util.ArrayList;
import java.util.List;
import model.Serie;

/**
 *
 * @author Itanir
 */
public class SerieImpl implements SerieDao<Serie> {

    @Override
    public void salvar(Serie s) {
    }

    @Override
    public List listarTodos() {
        List<Serie> list = new ArrayList<>();
        
        
        return list;
    }

    @Override
    public void alterar(Serie s) {
    }

    @Override
    public void remover(Serie s) {
    }
    
}

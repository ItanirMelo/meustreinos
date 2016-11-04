/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Itanir
 */
public interface TreinoDao <T> {
    
    void salvar(T tr);
    List listarTodos();
    void alterar(T tr);
    void remover(T tr);
    
    
}

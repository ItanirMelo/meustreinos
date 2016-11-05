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
 * @param <T>
 */
public interface AlunoDao <T> {
    
    void salvar(T a);
    List listarTodos();
    void alterar(T a);
    void remover(T a);
    
    
}

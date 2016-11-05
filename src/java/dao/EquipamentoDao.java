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
public interface EquipamentoDao <T> {
    
    void salvar(T s);
    List listarTodos();
    void alterar(T s);
    void remover(T s);
    
    
}

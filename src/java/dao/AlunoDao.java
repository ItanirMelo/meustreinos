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
public interface AlunoDao {
    
    void salvar(int id, String nome, String sexo);
//    List listarTodos();
    void alterar(int id, String nome, String sexo);
    void remover(int id);
    
    
}

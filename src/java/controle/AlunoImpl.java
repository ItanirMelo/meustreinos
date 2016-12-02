/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.AlunoDao;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;

/**
 *
 * @author Itanir
 */
public class AlunoImpl implements AlunoDao {
    
    
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;
    
    @Override
    public void salvar(int id, String nome, String sexo) {
        String sql = "INSERT INTO aluno (nome, idaluno, sexo) VALUES(?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setInt(2, id);
            stmt.setString(3, sexo);
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void alterar(int id, String nome, String sexo) {
        String sql = "UPDATE aluno set nome =?, id = ?, sexo=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setInt(2, (int) id);
            stmt.setString(3, sexo);
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    @Override
    public void remover(int id) {
        String sql = "DELETE FROM aluno WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/*
    @Override
    public List<> listarTodos() {
        List<> listAluno = new ArrayList<>();
        String sql = "Select id, nome, aluno from aluno order by nome";
        try {
            stmt = conn.prepareStatement(sql);
            rs  = stmt.executeQuery();
           
            while(rs.next()){
                Aluno a = new Aluno();
                a.setIdAluno(rs.getInt(1));
                a.setNome(rs.getString(2));
                
                listAluno.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listAluno;
    }

    public Aluno findById(int id) {
        String sql;
        sql = "SELECT aluno.id, aluno.nome FROM aluno "
                + " WHERE aluno.id = aluno.id AND aluno.id = ?";
        Aluno a = new Aluno();
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            rs.next();
            a.setIdAluno(rs.getInt(1));
            a.setNome(rs.getString(2));
            a.setSexo(rs.getString(3));
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
*/
}    
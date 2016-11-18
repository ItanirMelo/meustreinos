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

    public void salvar(Aluno a) {
        String sql = "INSERT INTO aluno (nome, idaluno, sexo) VALUES(?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            stmt.setInt(2, (int) a.getIdaluno());
            stmt.setString(3, a.getSexo());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Aluno a) {
        String sql = "UPDATE aluno set nome =?, id = ?, sexo=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            stmt.setInt(2, (int) a.getIdaluno());
            stmt.setString(3, a.getSexo());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void Excluir(Aluno a) {
        String sql = "DELETE FROM aluno WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, a.getId());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Aluno> getListAll() {
        List<Aluno> listAluno = new ArrayList<>();
        String sql = "Select id, nome, aluno from aluno order by nome";
        try {
            stmt = conn.prepareStatement(sql);
            rs  = stmt.executeQuery();
            
            while(rs.next()){
                Aluno a = new Aluno();
                a.setId(rs.getInt(1));
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
            a.setId(rs.getInt(1));
            a.setNome(notNull(rs.getString(2)));
            a.setSexo(notNull(rs.getString(3)));
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
    public String notNull(String msg){
        return (msg == null? "" : msg);
    }

    @Override
    public void salvar(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
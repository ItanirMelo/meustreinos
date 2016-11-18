/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ProfessorDao;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Professor;

/**
 *
 * @author Itanir
 */
public class ProfessorImpl implements ProfessorDao {
    
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;
    private Object p;

    public void salvar(Professor p) {
        String sql = "INSERT INTO professor (nomeprofessor, idprofessor) VALUES(?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNomeProfessor());
            stmt.setInt(2, (int) p.getIdProfessor());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Professor p) {
        String sql = "UPDATE professor set nomeprofessor =?, idprofessor = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNomeProfessor());
            stmt.setInt(2, (int) p.getIdProfessor());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void Excluir(Professor p) {
        String sql = "DELETE FROM professor WHERE idprofessor = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, p.getIdProfessor());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Professor> getListAll() {
        List<Professor> listProfessor = new ArrayList<>();
        String sql = "Select idprofessor, nomeprofessor, professor from professor order by nomeprofessor";
        try {
            stmt = conn.prepareStatement(sql);
            rs  = stmt.executeQuery();
            
            //<editor-fold defaultstate="collapsed" desc="comment">
            while(rs.next()){
//</editor-fold>
                Professor p = new Professor();
                p.setIdProfessor(rs.getInt(1));
                p.setNomeProfessor(rs.getString(2));
                
                listProfessor.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProfessor;
    }

    public Professor findById(int id) {
        String sql;
        sql = "SELECT professor.idprofessor, professor.nomeprofessor FROM professor "
                + " WHERE professor.idprofessor = professor.idprofessor AND professor.idprofessor = ?";
        Professor p = new Professor();
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            rs.next();
            p.setIdProfessor(rs.getInt(1));
            p.setNomeProfessor(notNull(rs.getString(2)));
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
    
    public String notNull(String msg){
        return (msg == null? "" : msg);
    }

    @Override
    public void salvar(Object p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param p
     */
    @Override
    public void remover(Object p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ConnectionFactory;
import dao.EquipamentoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Equipamento;

/**
 *
 * @author Itanir
 */
public class EquipamentoImpl implements EquipamentoDao {
    
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;

    public void salvar(Equipamento e) {
        String sql = "INSERT INTO equipamento (desc_equipamento, id_equipamento, imagem, musculo) VALUES(?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, e.getDesc_equipamento());
            stmt.setInt(2, (int) e.getId_equipamento());
            stmt.setString(3, e.getImagem());
            stmt.setString(4, e.getMusculo());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(EquipamentoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Equipamento e) {
        String sql = "UPDATE equipamento set desc_equipamento = ?, id_equipamento = ?, imagem=?, musculo=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, e.getDesc_equipamento());
            stmt.setInt(2, (int) e.getId_equipamento());
            stmt.setString(3, e.getImagem());
            stmt.setString(4, e.getMusculo());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EquipamentoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void Excluir(Equipamento e) {
        String sql = "DELETE FROM equipamento WHERE id_equipamento = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, e.getDesc_equipamento());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(EquipamentoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Equipamento> getListAll() {
        List<Equipamento> listEquipamento = new ArrayList<>();
        String sql = "Select id_equipamento, desc_equipamento from equipamento order by desc_equipamento";
        try {
            stmt = conn.prepareStatement(sql);
            rs  = stmt.executeQuery();
            
            while(rs.next()){
                Equipamento e = new Equipamento();
                e.setId_equipamento(rs.getInt(1));
                e.setDesc_equipamento(rs.getString(2));
                
                listEquipamento.add(e);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EquipamentoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listEquipamento;
    }

    public Equipamento findById(int id_equipamento) {
        String sql;
        sql = "SELECT equipamento.id, equipamento.desc FROM equipamento "
                + " WHERE equipamento.id = equipamento.id AND equipamento.id = ?";
        Equipamento e = new Equipamento();
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_equipamento);
            rs = stmt.executeQuery();
            
            rs.next();
            e.setId(rs.getInt(1));
            e.setDesc_equipamento(notNull(rs.getString(2)));
            e.setMusculo(notNull(rs.getString(3)));
            e.setImagem(notNull(rs.getString(3)));
            
        } catch (SQLException ex) {
            Logger.getLogger(EquipamentoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return e;
    }
    
    public String notNull(String msg){
        return (msg == null? "" : msg);
    }

    @Override
    public void salvar(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
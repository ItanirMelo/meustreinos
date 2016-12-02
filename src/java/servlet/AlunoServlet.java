/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controle.AlunoImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lab
 */
@WebServlet(name = "Aluno", urlPatterns = {"/alunoservlet"})
public class AlunoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recupera as informações da pagina aluno.jsp
        //int idAluno = Integer.valueOf(request.getParameter("aluno"));
        
        
        String id = request.getParameter("id");
        String nome = request.getParameter("aluno");
        String sexo = request.getParameter("sexo");
        
        //cria o objeto para manipular e salvar no banco
        AlunoImpl alunoImpl = new AlunoImpl();
    
        //popula o objeto aluno
        alunoImpl.salvar(Integer.parseInt(id),nome, sexo);

        //retorna para tela de cadastro
        response.sendRedirect("cadastroaluno.jsp");
    }

}
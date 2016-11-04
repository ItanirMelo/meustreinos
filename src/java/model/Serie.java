/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Itanir
 */
public class Serie {
    private String descricaoSerie, aplicacaoSerie, imagemExercicio;

    public String getDescricaoSerie() {
        return descricaoSerie;
    }

    public void setDescricaoSerie(String descricaoSerie) {
        this.descricaoSerie = descricaoSerie;
    }

    public String getAplicacaoSerie() {
        return aplicacaoSerie;
    }

    public void setAplicacaoSerie(String aplicacaoSerie) {
        this.aplicacaoSerie = aplicacaoSerie;
    }

    public String getImagemExercicio() {
        return imagemExercicio;
    }

    /**
     *
     * @param imagemExercicio
     */
    public void setImagemExercicio(String imagemExercicio) {
        this.imagemExercicio = imagemExercicio;
    }
    
}

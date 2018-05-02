/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.util.Date;

/**
 *
 * @author 1513 MXTI
 */
public class Treino {
    
    private String categoria;
    private Exercicio[] exercicio;
    private Date dataInicio;
    private Date dataTermino;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Exercicio[] getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio[] exercicio) {
        this.exercicio = exercicio;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

/**
 *
 * @author 1513 MXTI
 */
public class Aluno {
    
    private String nome;
    private int idade;
    private String periodoDisponivel;
    private Treino treino;
    private Instrutor instrutor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPeriodoDisponivel() {
        return periodoDisponivel;
    }

    public void setPeriodoDisponivel(String periodoDisponivel) {
        this.periodoDisponivel = periodoDisponivel;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    
}

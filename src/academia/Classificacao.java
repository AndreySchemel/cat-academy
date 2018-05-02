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
public class Classificacao {
  
    private Date date;
    private double pesoAtual;
    private double pesoDesejado;
    private double medidaPerna;
    private double medidaPernaDesejada;
    private double medidaBraco;
    private double medidaBracoDesejada;
    private double medidaQuadril;
    private double medidaPeito;
    private double medidaPeitoDesejada;
    private Suplemento[] suplemento;
    private Alimento[] alimento;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public double getPesoDesejado() {
        return pesoDesejado;
    }

    public void setPesoDesejado(double pesoDesejado) {
        this.pesoDesejado = pesoDesejado;
    }

    public double getMedidaPerna() {
        return medidaPerna;
    }

    public void setMedidaPerna(double medidaPerna) {
        this.medidaPerna = medidaPerna;
    }

    public double getMedidaPernaDesejada() {
        return medidaPernaDesejada;
    }

    public void setMedidaPernaDesejada(double medidaPernaDesejada) {
        this.medidaPernaDesejada = medidaPernaDesejada;
    }

    public double getMedidaBraco() {
        return medidaBraco;
    }

    public void setMedidaBraco(double medidaBraco) {
        this.medidaBraco = medidaBraco;
    }

    public double getMedidaBracoDesejada() {
        return medidaBracoDesejada;
    }

    public void setMedidaBracoDesejada(double medidaBracoDesejada) {
        this.medidaBracoDesejada = medidaBracoDesejada;
    }

    public double getMedidaQuadril() {
        return medidaQuadril;
    }

    public void setMedidaQuadril(double medidaQuadril) {
        this.medidaQuadril = medidaQuadril;
    }

    public double getMedidaPeito() {
        return medidaPeito;
    }

    public void setMedidaPeito(double medidaPeito) {
        this.medidaPeito = medidaPeito;
    }

    public double getMedidaPeitoDesejada() {
        return medidaPeitoDesejada;
    }

    public void setMedidaPeitoDesejada(double medidaPeitoDesejada) {
        this.medidaPeitoDesejada = medidaPeitoDesejada;
    }

    public Suplemento[] getSuplemento() {
        return suplemento;
    }

    public void setSuplemento(Suplemento[] suplemento) {
        this.suplemento = suplemento;
    }

    public Alimento[] getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento[] alimento) {
        this.alimento = alimento;
    }
    
    
    
}

package com.extremefit.codexp.senai.extremefitcodexp.model;

import java.util.Date;

/**
 * Created by codexp on 12/03/2018.
 */

public class Funcionario {

    private String nome;
    private double altura;
    private double peso;
    private String cpf;
    private Date dataNascimento;
    private String rfid;
    private String sexo;
    private int usuarioID;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", rfid='" + rfid + '\'' +
                ", sexo='" + sexo + '\'' +
                ", usuarioID=" + usuarioID +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }
}

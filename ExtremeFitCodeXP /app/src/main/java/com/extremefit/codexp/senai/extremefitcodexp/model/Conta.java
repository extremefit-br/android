package com.extremefit.codexp.senai.extremefitcodexp.model;

/**
 * Created by codexp on 12/03/2018.
 */

public class Conta {

    private String email;
    private String senha;

    public Conta(String email, String senha) {

        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

package com.example.codexp.projetomenuexemplo.model;

/**
 * Created by codexp on 06/03/2018.
 */

public class Usuario {

    private String email;
    private String senha;

    @Override
    public String toString() {
        return "Usuario{" +
                ", email='" + email + '\'' +
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

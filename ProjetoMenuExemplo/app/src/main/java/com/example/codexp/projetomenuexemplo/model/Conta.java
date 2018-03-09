package com.example.codexp.projetomenuexemplo.model;

/**
 * Created by codexp on 06/03/2018.
 */

public class Conta {

        private String email;
        private String senha;

        public Conta(String usuario, String senha) {
            this.email = usuario;
            this.senha = senha;
        }

        public String getUsername() {
            return email;
        }

        public void setUsername(String username) {
            this.email = username;
        }

        public String getPassword() {
            return senha;
        }

        public void setPassword(String password) {
            this.senha = password;
        }
    }


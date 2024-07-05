package com.sistema.examenes.entidades;

public class JwtReponse {

    private String token;

    public JwtReponse(){}
    public JwtReponse(String token){
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

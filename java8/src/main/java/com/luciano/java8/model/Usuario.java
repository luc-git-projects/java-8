package com.luciano.java8.model;

import lombok.Getter;
import lombok.Setter;


public class Usuario {

    @Getter
    @Setter
    private String nome;
    
    @Getter
    @Setter
    private int pontos;
    
 
    private boolean moderador;

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }
    
    
    public void tornarModerador(){
        this.moderador = true;
    }
    
    public boolean isModerador(){
        return moderador;
    }
}
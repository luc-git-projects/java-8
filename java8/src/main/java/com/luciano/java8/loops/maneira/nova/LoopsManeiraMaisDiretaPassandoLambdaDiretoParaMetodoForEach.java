package com.luciano.java8.loops.maneira.nova;

import com.luciano.java8.model.Usuario;
import java.util.Arrays;
import java.util.List;

public class LoopsManeiraMaisDiretaPassandoLambdaDiretoParaMetodoForEach {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        
        
        /*
            imprimindo o nome de todos os usuarios
        */
        usuarios.forEach(u -> System.out.println(u.getNome()));
        
         /*
            toranando todos os usuarios moderadores
        */
         
         usuarios.forEach(u -> u.tornarModerador());
         usuarios.forEach(u -> System.out.println(u.isModerador()));
       
    }

}

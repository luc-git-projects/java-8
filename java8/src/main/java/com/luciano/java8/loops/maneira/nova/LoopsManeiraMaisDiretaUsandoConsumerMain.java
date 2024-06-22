package com.luciano.java8.loops.maneira.nova;

import com.luciano.java8.model.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LoopsManeiraMaisDiretaUsandoConsumerMain {

    public static void main(String[] args) {
        
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        
        List<Usuario> usuarios = Arrays.asList(user1, user2,
                user3);
        
        
        //Consumer<Usuario> consumer = (Usuario u) -> {System.out.println(u.getNome());};
        
        //Consumer<Usuario> consumer = u ->{System.out.println(u.getNome());};
        
        /*
         se tiver so uma linha não precisa nem das chaves
        */
        Consumer<Usuario> consumer = u -> System.out.println(u.getNome());
        
        usuarios.forEach(consumer);
    }

}
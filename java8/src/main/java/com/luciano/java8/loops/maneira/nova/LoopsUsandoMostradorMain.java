package com.luciano.java8.loops.maneira.nova;

import com.luciano.java8.model.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LoopsUsandoMostradorMain {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        
        List<Usuario> usuarios = Arrays.asList(user1, user2,
                user3);
        
        Consumer<Usuario> mostrarMensagem = u -> System.out.println("antes de imprimir os nomes");
        
        
        /*
         como mostrador implementa um Consumer ele é um consumer
        */
        Mostrador imprimeNome = new Mostrador();
        
       
        
        usuarios.forEach(imprimeNome);
        
        /*
         o metodo andThen primeiro 
        imprime a mensagem "antes de imprimir os nomes" 
        e depois imprime os nomes dos usuarios
        */
        usuarios.forEach(mostrarMensagem.andThen(imprimeNome));
    }

}

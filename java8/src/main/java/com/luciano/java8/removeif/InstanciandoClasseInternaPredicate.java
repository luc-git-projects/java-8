package com.luciano.java8.removeif;

import com.luciano.java8.model.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class InstanciandoClasseInternaPredicate {

    public static void main(String[] args) {
        
         Predicate<Usuario> predicado = new Predicate<Usuario>() {
            
            @Override
            public boolean test(Usuario u) {
                
                /*
                    vai remover todos os usuarios 
                    com nota maior do que 160
                */
                return u.getPontos() > 160;
            }
        };
         
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        
        usuarios.removeIf(predicado);
        
        usuarios.forEach(u -> System.out.println(u));
    }

}
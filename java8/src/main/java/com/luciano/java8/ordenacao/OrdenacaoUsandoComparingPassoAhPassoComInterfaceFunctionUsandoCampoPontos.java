package com.luciano.java8.ordenacao;

import com.luciano.java8.model.Usuario;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenacaoUsandoComparingPassoAhPassoComInterfaceFunctionUsandoCampoPontos {

    public static void main(String[] args) {
        
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        
        /*
            Gera autoboxing o que leva a um overhead
        */
        Function<Usuario, Integer> extraiPontos = u -> u.getPontos();
        
        Comparator<Usuario> comparator = Comparator.comparing(extraiPontos);
        
        usuarios.sort(comparator);
        
        usuarios.forEach(u -> System.out.println(u));
    }

}
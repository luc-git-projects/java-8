package com.luciano.java8.ordenacao;

import com.luciano.java8.model.Usuario;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenacaoUsandoComparingPassoAhPassoComInterfaceFunctionUsandoCampoNome {

    public static void main(String[] args) {
         
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        
        Function<Usuario, String> extraiNome = u -> u.getNome();
        
        Comparator<Usuario> comparator = Comparator.comparing(extraiNome);
        
        usuarios.sort(comparator);
        
        usuarios.forEach(u -> System.out.println(u));
    }

}
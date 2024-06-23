package com.luciano.java8.removeif.methodreference;

import com.luciano.java8.model.Usuario;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoMethodReferencePrimeiroPorPontosEmCasoDeEmpatePorNome {

    public static void main(String[] args) {
        
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        Usuario user4 = new Usuario("Fernando Almeida", 120);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        
        usuarios.sort(Comparator.comparingInt(Usuario::getPontos).thenComparing(Usuario::getNome));
        
        usuarios.forEach(System.out::println);
    }

}
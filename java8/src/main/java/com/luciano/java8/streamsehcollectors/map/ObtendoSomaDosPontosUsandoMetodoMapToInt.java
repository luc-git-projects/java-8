package com.luciano.java8.streamsehcollectors.map;

import com.luciano.java8.model.Usuario;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StringTemplate.STR;

public class ObtendoSomaDosPontosUsandoMetodoMapToInt {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        double somaDosPontos = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .sum();



        System.out.println(STR."Soma = \{somaDosPontos}");
    }
}

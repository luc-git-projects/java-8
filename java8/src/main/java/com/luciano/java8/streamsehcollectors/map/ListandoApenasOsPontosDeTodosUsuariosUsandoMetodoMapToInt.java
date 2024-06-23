package com.luciano.java8.streamsehcollectors.map;

import com.luciano.java8.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListandoApenasOsPontosDeTodosUsuariosUsandoMetodoMapToInt {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        List<Integer> pontos = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        pontos.stream().forEach(System.out::println);
    }
}

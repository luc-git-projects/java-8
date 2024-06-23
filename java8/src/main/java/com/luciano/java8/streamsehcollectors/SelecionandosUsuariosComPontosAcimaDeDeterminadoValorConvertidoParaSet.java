package com.luciano.java8.streamsehcollectors;

import com.luciano.java8.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class SelecionandosUsuariosComPontosAcimaDeDeterminadoValorConvertidoParaSet {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        Usuario user4 = new Usuario("Carlos", 112);
        Usuario user5 = new Usuario("Andre", 210);
        Usuario user6 = new Usuario("Jośe", 178);
        Usuario user7 = new Usuario("Antonio", 124);
        Usuario user8 = new Usuario("Henrique", 284);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);
        usuarios.add(user6);
        usuarios.add(user7);
        usuarios.add(user8);

        Set<Usuario> notaAcimaValor = usuarios.stream()
                .filter(u -> u.getPontos() > 150)
                .collect(toSet());

        notaAcimaValor.stream().forEach(System.out::println);
    }
}

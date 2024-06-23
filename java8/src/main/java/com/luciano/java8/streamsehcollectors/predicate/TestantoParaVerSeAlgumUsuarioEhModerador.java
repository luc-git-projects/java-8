package com.luciano.java8.streamsehcollectors.predicate;

import com.luciano.java8.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class TestantoParaVerSeAlgumUsuarioEhModerador {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        /*
            metodo que torna um usuario moderador
         */
        //user2.tornarModerador();

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        boolean ehModerador = usuarios.stream().anyMatch(Usuario::isModerador);

        System.out.println(STR."Tem algum usúario que é moderador = \{ehModerador}");
    }
}

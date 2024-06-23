package com.luciano.java8.ordenacao;

import com.luciano.java8.model.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoInstanciandoInterfaceComparator {

    public static void main(String[] args) {
        
        
        Comparator<Usuario> comparadorNome = new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                
                return  u1.getNome().compareTo(u2.getNome());
            }
        };
        
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        
        Collections.sort(usuarios, comparadorNome);
        
        usuarios.forEach(u -> System.out.println(u));
    }

}
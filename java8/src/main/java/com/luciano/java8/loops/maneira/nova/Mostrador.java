package com.luciano.java8.loops.maneira.nova;

import com.luciano.java8.model.Usuario;
import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario>{

    @Override
    public void accept(Usuario u) {
        System.out.println(u.getNome());
    }

}
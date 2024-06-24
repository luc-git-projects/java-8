package com.luciano.java8.arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListandoArquivosDoDiretorio {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("./com/luciano/java8/arquivos/"))
                    .forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println(ex);;
        }
    }
}

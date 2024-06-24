package com.luciano.java8.streamsinfinitos;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class GerandoIntStreamComLambda {

    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> inteiros = IntStream.generate(()-> random.nextInt(10))
                .limit(4)
                .boxed()
                .toList();

        inteiros.forEach(System.out::println);
    }
}

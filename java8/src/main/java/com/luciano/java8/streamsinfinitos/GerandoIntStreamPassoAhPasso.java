package com.luciano.java8.streamsinfinitos;

import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class GerandoIntStreamPassoAhPasso {

    public static void main(String[] args) {
        Random random = new Random();
        IntSupplier intSupplier = () -> random.nextInt();
        IntStream intStream = IntStream.generate(intSupplier);

        List<Integer> inteiros = intStream.limit(5)
                .boxed()
                .toList();

        inteiros.forEach(System.out::println);
    }
}

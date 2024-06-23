package com.luciano.java8.ordenacao;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoEmClassesQueImplemetamComparableUsandoNaturalOrder {

    public static void main(String[] args) {
        
        List<String> nomes = Arrays.asList("Otavia", "Pedro", "Adriano", "Camila");
        
        nomes.sort(Comparator.naturalOrder());
        
        nomes.forEach(n -> System.out.println(n));
    }

}
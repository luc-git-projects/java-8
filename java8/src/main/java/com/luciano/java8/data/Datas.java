package com.luciano.java8.data;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Datas {
    public static void main(String[] args) {
        System.out.println("hoje é dia: " + MonthDay.now().getDayOfMonth());

        LocalDate data = LocalDate.now();
        YearMonth ym = YearMonth.from(data);
        System.out.println(ym.getMonth() + " " + ym.getYear());

        System.out.println(LocalDate.of(2014, 12, 25));
        System.out.println(LocalDate.of(2014, Month.DECEMBER, 25));

        Locale pt = new Locale("pt");
        System.out.println(Month.DECEMBER.getDisplayName(TextStyle.FULL, pt));

        System.out.println(Month.DECEMBER.getDisplayName(TextStyle.SHORT, pt));

        LocalDateTime agora = LocalDateTime.now();
        String resultado = agora.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(resultado);


        LocalDateTime agora2 = LocalDateTime.now();
        String data2 = agora2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(data2);

        LocalDate agoraEmData = LocalDate.parse(data2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(agoraEmData);

        LocalDate agora3 = LocalDate.now();
        LocalDate outraData = LocalDate.of(1989, Month.JANUARY, 25);
        long dias = ChronoUnit.DAYS.between(outraData, agora3);
        long meses = ChronoUnit.MONTHS.between(outraData, agora);
        long anos = ChronoUnit.YEARS.between(outraData, agora);
        System.out.println(STR."\{dias} dais, \{meses} meses, \{anos} anos");
    }
}

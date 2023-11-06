package xPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamPractice {


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Emir", "Amar", "Faris", "Haris"));
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Emir", "Amar", "Faris", "Haris"));

//        for(String name : names) { // NE RADI ZATO STO name.concat() RETURNA VRIJEDNOST, MI NE MIJENJAMO name OVDJE JER SU Stringovi IMMUTABLE
//            name.concat(" Prezime");
//            System.out.println(name);
//        }

        for(int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).concat(" Prezime"));
//            System.out.println(names.get(i));
        }

        ArrayList<String> names3 = (ArrayList<String>) names2.stream() // CASTUJEMO, INACE NE RADI
                .map(name -> name.concat(" Prezime")).collect(Collectors.toList());

//        names3.forEach(name -> System.out.println(name));

        ArrayList<String> names4 = (ArrayList<String>) names2.stream().filter(name -> name.length() > 5).collect(Collectors.toList());

        names4.forEach(name -> System.out.println(name)); // NE ISPISUJE NISTA SAMO JEDNOM MOZEMO ISKORISTITI .stream() NA LISTI, OVDJE DRUGI PUT ZA names2 KORISTIMO

    }

}

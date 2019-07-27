package ru.nsk.eltex.compareto;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Man> sravnenie = new ArrayList<Man>();
        Man man1 = new Man("Bob", 15);
        Man man2 = new Man("Borys", 19);
        Man man3 = new Man("Bobr", 65);
        Man man4 = new Man("Bobster", 45);
        Man man5 = new Man("Boby", 5);

        sravnenie.add(man1);
        sravnenie.add(man2);
        sravnenie.add(man3);
        sravnenie.add(man4);
        sravnenie.add(man5);

        System.out.println("-----------------Sorted-------------------");
        Collections.sort(sravnenie);
        for (Man o: sravnenie){
            System.out.println(o);
        }
    }
}

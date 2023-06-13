package curs10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        //se redimensioneaza automat
        //nu permite duplicate
        //e structura neordonata de date

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.add("mov");
        set.add("alb");
        set.add("rosu");
        set.add("galben");
        set.add("galben");
        System.out.println("=====================");

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        for (String element: set){
            System.out.println(element);
        }

        System.out.println("=====================");
        Iterator<String> iterator = set.iterator();//e acelasi lucru cu for each -  e in spatele implementarii for eachului
        while (iterator.hasNext()){//has next inseamna ca are valoare
            System.out.println(iterator.next());
        }


        System.out.println("----------------------");

        set.remove("galben");

        for (String element: set){
            System.out.println(element);
        }
        System.out.println("----------------------");

        System.out.println(set.contains("negru"));
        System.out.println("contine rosu? "+ set.contains("rosu"));

        System.out.println("----------------------");

        set.clear();
        System.out.println(set.isEmpty());
    }
}

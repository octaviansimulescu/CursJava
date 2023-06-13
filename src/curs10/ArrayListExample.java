package curs10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        System.out.println(list.size());

        list.add("oana");
        list.add("ion");
        list.add("maria");
        list.add("gabriel");

        for (String nume:list){
            System.out.println(nume);
        }
//este o forma ordonata (dupa index)
        System.out.println("=============================");

        System.out.println(list.get(2));

        list.add(0,"carmen");

        System.out.println("=============================");

        list.add(1,"maria");

        for (String nume:list){
            System.out.println(list.indexOf(nume)+ " : " + nume);
        }
        System.out.println("=============================");
        System.out.println(list.get(4));

        list.add(6,"vasile");

        for (String nume:list){
            System.out.println(list.indexOf(nume)+ " : " + nume);
        }
        System.out.println("=====================");
        list.remove(0);
        list.remove("maria");
        for (String nume:list){
            System.out.println(list.indexOf(nume)+ " : " + nume);
        }

        list.clear();
        System.out.println(list.size());
    }

}

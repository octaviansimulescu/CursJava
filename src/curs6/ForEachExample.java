package curs6;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        String[] orase = {"Iasi", "Cluj", "Brasov", "Pitesti", "Ploiesti"};

        for (int i = 0; i < orase.length; i++) {
            System.out.println(orase[i]);
        }

        System.out.println("----------------------");

        //for each loop
        for(String elem : orase){ //element : structura prin care iterez
            System.out.println(elem);
        }
        System.out.println("----------------------");

        System.out.println(orase);
        System.out.println(Arrays.toString(orase));
    }

}

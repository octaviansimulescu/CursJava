package curs5;

import java.util.Scanner;

public class WhileExample3 {


    /*
      program care calculeaza salariul pe o saptamana
      intrebam utilizatorul cate ore a lucrat
      calculam doar daca a lucrat minim 1 ora
      sau maxim 40
      daca introduce un nr invalid (0 sau 40+) il rugam s a introduca din nou
       */

    public static void main(String[] args) {

        int ratePerHours = 20;
        System.out.println("Cate ore ai lucrat");
        Scanner scanner=new Scanner(System.in);
        int oreLucrate = scanner.nextInt();


        while (oreLucrate<1 || oreLucrate>40){
            System.out.println("Cate ore ai lucrat");
            oreLucrate = scanner.nextInt();
        }

        System.out.println("Salariul e: " + oreLucrate * ratePerHours);




    }


}

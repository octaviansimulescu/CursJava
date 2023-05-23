package curs5;

import curs4.Palindrom;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class DiceGame {
    /*
    Facem joc de xaruri care are regulili:
    daca da in total 2,6,12 > pierde jocul > ne oprim
    daca da in total 3,7 > castiga jocul > ne oprim
    daca da in total 4, 11,8 > repeta aruncarea
    daca da oricare dint variantele care nu au fost enumrate atunci il intrebam daca vrea sa mai joace
    Respunsul va fi un boolean
     */

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int dice1;
        int dice2;






        boolean startJoc=true;

     /*   if(total== 3 || total == 7){
            System.out.println("Congrats ai castigat");
        }
        while (total == 4 || total ==8 || total == 11 && startJoc==true){
            System.out.println("ai dat" + dice1 + " si " + dice2);

        }*/

        while (startJoc==true) {
            dice1 = (int) (Math.random()*6+1);
            dice2 = (int) (Math.random()*6+1);
            int total = dice1 + dice2;
            System.out.println("Ai dat " + total);

            if(total == 2 || total == 6 || total == 12){
                System.out.println("Ai pierdut, ai dat " + total);
                startJoc = false;
            } else if (total == 4 || total == 8|| total == 11) {
                System.out.println("automati mai dai odata");
               startJoc = false;
            }else if (total == 3 || total == 7){
                System.out.println("Ai castigat ");
                startJoc = false;
            }else {
                System.out.println("Vrei sa mai joci?" );
                startJoc =scanner.nextBoolean();
            }
        }
        System.out.println("Game over");
    }
}

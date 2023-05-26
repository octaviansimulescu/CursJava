package curs6;

import java.util.Scanner;

public class SwitchExample4 {
    /*
    Facem un program care verifica daca un student e eligibil pt bursa
    conditii: sa fie anul 3
    sa aiba un punctaj de 80 pt burs 1
    sa aiba punctaj 50 pt bursa 2
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ce an esti? ");
        int an = scanner.nextInt();

        int punctaj;

        switch (an){
            case 3:
                System.out.println("adauga punctaj ");
                 punctaj = scanner.nextInt();
                switch (punctaj){
                    case 80:
                        System.out.println("Eligibil de bursa 1");
                        break;
                    case 50:
                        System.out.println("eligibil de bura 2");
                    default:
                        System.out.println("non eligibil");
                }
                break;
            default:
                System.out.println("tot nu esti eligibil");
        }
    }
}

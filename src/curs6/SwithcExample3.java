package curs6;

import java.util.Scanner;

public class SwithcExample3 {
    /*
    facem un program care imi cere de la tastatura un an si o luna
    si printeaza cate zile are luna respectiva
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu an ");
        int an = scanner.nextInt();
        System.out.println("Introdu luna ");
        int luna = scanner.nextInt();
        int zile = 0;

        switch (luna) {
            case 4:
            case 6:
            case 9:
            case 11:
                zile = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                zile = 31;
                break;
            case 2:
                if (an % 4 == 0 && an % 100 != 0 || an % 400 == 0) {
                    zile = 29;
                } else {
                    zile = 28;
                }
                break;
            default:
                System.out.println("Valoare invalida");

                System.out.println(zile);
            //case an % 4 == 0 && an % 100 != 0 || an % 400 == 0;
        }


    }
}

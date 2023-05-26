package curs6;

import java.util.Scanner;

public class SwitchExample {
    /*
       intrebam userul un calificativ
       in functie de calificativ printam
       a -> felicitari
       b -> destul de bine
       c -> suficient
       d -> insuficient
       daca introduce alt calificativ printam -> invalid
        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu calificativ: ");
        String calificativ = scanner.next();
        switch (calificativ) {
            case "A":
                System.out.println("Felicitari");
                break;
            case "B":
                System.out.println("Destul de bine");
                break;
            case "C":
                System.out.println("Suficient");
                break;
            case "D":
                System.out.println("Insuficient");
                break;
            default:
                System.out.println("Calificativ invalid");
        }

        char litera = 'a';
        switch (litera){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("este vocala");
                break;
            default:
                System.out.println("este consoana");
        }
    }
}

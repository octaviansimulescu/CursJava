package curs5;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        String[] orase = {"Iasi", "Cluj", "Pitesti", "Oradea"};


        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        do {
            System.out.println("please enter a number");
            int nr2 = scan.nextInt();
            System.out.println(nr2 * 10);
        }while (nr !=0);
    }
}

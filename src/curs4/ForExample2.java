package curs4;

import java.util.Scanner;

public class ForExample2 {

    /*
    program care cere userului numere incontinuu
    le inmulteste cu 10
    face asa pana cand userul introduce 0
    daca a introdus 0, face exit din loop
     */

    public static void main(String[] args) {
        System.out.println("please enter number");
        Scanner scanner = new Scanner(System.in);

     /*   for (;;){ // conditiile din for sunt optionale
            int nr = scanner.nextInt();
            if (nr == 0){
                break;
            }
            System.out.println("Please enter a number");

        }*/
    for (int nr = scanner.nextInt(); nr != 0; nr =scanner.nextInt()){
        System.out.println(nr);
        System.out.println("Pleas eneter a number");
    }
    }

}

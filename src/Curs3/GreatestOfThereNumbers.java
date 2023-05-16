package Curs3;

import java.util.Scanner;

public class GreatestOfThereNumbers {

    /*
    Program care citeste 3 numere de la tastatura
    Verifica care dintre cele 3 numere este cel mai mare
    Printeaza rezultatul sub forma:
    Ex: First number is the greatest
    Daca cel mai mare numar este egal cu altul printez : some numbers are equal
     */
        int number1, number2, number3;

        public void inputNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add 1st number: ");
            number1 = scanner.nextInt();
            System.out.println("Add 2nd number: ");
            number2 = scanner.nextInt();
            System.out.println("Add 3rd number: ");
            number3 = scanner.nextInt();
        }

    public void compareNumber(){
        if(number1 > number3 && number1 > number2){
            System.out.println(number1 + "is the biggest number");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + "is the biggest number");
        } else if (number3 > number1 && number3 > number2){
            System.out.println(number3 + "is the biggest number");
        } else {
            System.out.println("Some numbers are equals");
        }
    }
}

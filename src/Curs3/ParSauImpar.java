package Curs3;

import java.util.Scanner;

public class ParSauImpar {

    int number;

    public void askTheUserForANumber(){
        System.out.println("Please add a number: ");
        Scanner scan = new Scanner(System.in);
         number = scan.nextInt();
        scan.close();//inchide canalul de comunicare intre user si program
    }
//metodele trebuie sa fie cat mai scurte si cat mai putin functionalitati
    public void checkNumberIsOddOrEven(){
        askTheUserForANumber();//poti chema o alta metoda direct din metoda care e dependenta de ea
        if (number % 2 == 0){
            System.out.println("Number " + number + " is even");
        }else {
            System.out.println("Number " + number + " is odd");
        }
    }
}

package Curs3;

import java.util.Scanner;

public class PunctajTest {

    int grade;

    public void askTestScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie ce not ai luat: ");
        grade = scanner.nextInt();

    }
    public void examPassed(){
        /*askTestScore();*/
        if(grade >= 0 && grade <= 65){
            System.out.println("Ai picat");
        }else {
            System.out.println("Felicitari, ai trecut!");
        }
    }
}

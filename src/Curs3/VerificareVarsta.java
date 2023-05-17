package Curs3;

import java.util.Scanner;

public class VerificareVarsta {
    int age;

    public  void tellAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ce varsta ai tinere? ");
        age = scanner.nextInt();
    }

    public void checkAge(){
        /*tellAge();*/
        if(age < 18){ //n-am pus conditie de numar pozitiv ca n-a cerut exercitiul
            System.out.println("Esti minor");
        }else if (age >= 18 && age <= 65){
            System.out.println("Esti adult");
        } else
            System.out.println("Esti batran");
        }
    }


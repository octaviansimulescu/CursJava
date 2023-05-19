package curs4;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner =new Scanner(System.in);
        num1 =scanner.nextInt();
        num2 =scanner.nextInt();

        if(num1 >= 0) {
            System.out.println("Num1 is pozitive");
        }else {
            System.out.println("Num1 is negative");
        }
        String result = num1>0?"Num1 is positive":"Num1 is negative";
        //ternary

        if(num2 >= 0) {
            System.out.println("Num2 is pozitive");
        }else {
            System.out.println("Num2 is negative");
        }
        if(num1 >= 0 && num2 >= 0) {
            System.out.println("Numbers are pozitive");
        }else {
            System.out.println("At least 1 number is negative");
        }

        if(num1>num2) {
            System.out.println("Num1 is the greatest");

        }else if(num1 <num2) {
            System.out.println("Num2 is the greatest");

        }else {
            System.out.println("Numbers are equal");
        }

        result=num1>num2?"Nr1 e mai mare":num2<num1?"Nr 2 mai mare":"egale";//ternery pt toate

        num1 = 10;
        System.out.println("Post increment");
        System.out.println("increment" + num1);
        System.out.println("increment" + num1++);
        System.out.println("increment" + num1);

        num1=10;
        System.out.println("Pre increment");
        System.out.println("increment" + num1);
        System.out.println("increment" + ++num1);
        System.out.println("increment" + num1);
    }

}

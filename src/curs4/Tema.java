package curs4;

import java.util.Scanner;

public class Tema {
    double pretDupaDiscount;
    public double discountFactura(double pret){
       double discount = pret>=100? 10: 5;
       return pretDupaDiscount= pret - pret * (discount/100);
    }

  public void introduCalificativ(){
      Scanner scanner = new Scanner(System.in);
      System.out.printf("Introdu nota: ");
      int nota = scanner.nextInt();
      String calificativ = nota>= 90?"FB":nota>=80?"B":"S";
      String rezultat =calificativ.equals("FB")?"Ai primit : Foarte Bine":calificativ.equals("B")?"Ai primit : Bine":"Ai primit : Suficient";
      System.out.println(rezultat);
  }

  public void addNumbers(){
        Scanner scan = new Scanner(System.in);
        int number;
        int sum=0;
        for(int i = 1;i<=10;i++){
            System.out.println("Please enter number "+ i +":");
            number = scan.nextInt();
            sum+=number;
        }
      System.out.println("the sum is:" +sum);
  }

    public void multiplyNumbers() {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Please enter number:");
        number = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multiplication= number * i;

            System.out.println("Print multiplication " + number + " * " + i + " = " + (multiplication));
        }
    }

}

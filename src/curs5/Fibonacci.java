package curs5;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci =new Fibonacci();
        fibonacci.forFibonacci();
        fibonacci.whileFibonacci();

    }
    int F0=0;
    int F1=1;
    int suma;
   static int nrCalculate=9;

    public void forFibonacci() {
        System.out.printf("Seria Fibonacci pentru " + nrCalculate + " numere este: ");
        for (int i = 0; i<nrCalculate;i++){
            System.out.printf(F0 + " ");
            suma = F0 + F1;
            F0 = F1;
            F1 = suma;
        }
    }


    public void whileFibonacci(){
        F0=0;
        F1=1;
        System.out.printf("%nSeria Fibonacci pentru " + nrCalculate + " numere este: ");
        int i = 0;
        while (i < nrCalculate){
            System.out.printf(F0 + " ");
            suma = F0 + F1;
            F0 = F1;
            F1 = suma;
            i++;
        }
    }
}

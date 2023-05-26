package curs5;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci =new Fibonacci();
        fibonacci.forFibonnacci();
    }
    int F0=0;
    int F1=0;
    int suma=0;
    int nrCalculate=9;

    public void forFibonnacci(){
        for (int i = 0;i<nrCalculate;i++){
           suma= F0 + F1;
           F1 = i - suma;

        }
        System.out.println("Seria fibonnaci pt 9 numere e" + suma);
    }
}

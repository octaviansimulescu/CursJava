package curs7;

import java.util.Arrays;
import java.util.Scanner;

public class Tema3 {

    public static void main(String[] args) {
        Tema3 tema3=new Tema3();
        tema3.numbersOfArrayWhile();
    }

    public void numbersOfArrayFor(){
        int[]array=new int[10];
        Scanner scanner = new Scanner(System.in);
        int n;
        for (int i = 0; i<array.length;i++){
            System.out.println("element " + i);
            n = scanner.nextInt();
            array[i] = n;
        }
        System.out.println(Arrays.toString(array));
    }

    public void numbersOfArrayWhile() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int n;
    int i = 0;
    while (i< array.length){
        System.out.println("element " + i);
        n=scanner.nextInt();
        array[i]=n;
        i++;
    }
        System.out.println(Arrays.toString(array));
    }
}

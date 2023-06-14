package curs7;

import java.util.Arrays;
import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {
        Tema1 tema1 = new Tema1();
        tema1.reverseWhile();

    }

    public int[] addNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("add array length");
        int len = scanner.nextInt();
        int[]array = new int[len];
        for (int i = 0;i<array.length;i++) {
            System.out.println("introdu elementul " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public void reverseFor(){
        int[]array = addNumbers();
        for (int i = 0;i<array.length/2;i++){//plecam de la 0 pana i devine mai mic ca jumatatea lungimea arrayului
            int j = array[i];// j = 1
           array[i]=array[array.length- i -1];//elem 0 devine length(3) - 1
           array[array.length - i -1] = j;//elem length(3) - 1 devine j=1
            /*
            pasi
            i = 0
            iteram pana cand i < ca jumatate din length
            j este primul element al arrayului adica 1 (index 0)
            index 0 al arrayului devine indexul length(3) - i (0) -1) = 2
            indexul length(3) - i (0) -1) = 2 ia valorea lui j (1)
            iteram din nou -> i = index 1
            j este a 2lea element al arrayului adica 2 (index 1)
            index 1 al arrayului devine indexul length(3) - i (1) -1) = 1
            indexul length(3) - i (1) -1) = 1 ia valoarea j (2)
            iteram din nou -> i = index 2
            j este a 3lea element al arrayului adica 3 (index 2)
            index 2 al arrayului devine indexul length(3) - i (2) -1) = 0
            indexul length(3) - i (2) -1) = 0 ia valoarea lui j (3)
             */
        }
        System.out.println("Array reversed " + Arrays.toString(array));
    }

    public void reverseWhile(){
        int[]array = addNumbers();
        int i= 0;
        while (i<array.length/2){
            int j = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = j;
            i++;
        }
        System.out.println("Array reversed " + Arrays.toString(array));
    }
}

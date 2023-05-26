package curs6;

public class FindindexOfElementInArray {
    /*
    avem un array si vrem sa aflam indexul unui anumit element
    Ex: index pt element 8 este 3
    rezolvam cu:
    FOR
    FOR EACH
    WHILE
    DO WHILE
     */

    static int[] numbers = {3, 5, 7, 8, 9, 2, 12};

    public static void main(String[] args) {

        System.out.println("-----FOR");
        rezolvareFor(3);
        System.out.println("-----FOREACh");
        rezolvareForEach(3);
    }

    public static void rezolvareFor(int element) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                System.out.println("index pt " + element + " este " + i);
            }
        }
    }

    public static void rezolvareForEach(int number) {
        int i = 0;
        for (int elem : numbers) {
            if (number == elem) {
                System.out.println("index pt " + elem + " este " + elem);
            }
            i++;
        }
    }


    public static void rezolvareWhile(int number) {
        int i = 0;
        while (i < numbers.length){
            if(numbers[i]==number){
                System.out.println("Index pentru " + number + " este " + i);
            }
            i++;
        }
    }


    public static void rezolvareDoWhile(int number) {
        int i = 0;
        do {
            if (numbers[i] == number) {
                if (numbers[i] == number) {
                    System.out.println("Index pentru " + number + " este " + i);
                }
                i++;
            }
        }while (i < numbers.length);
    }
}
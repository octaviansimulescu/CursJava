package curs4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        /*
        Program care cere un text de la tastatura
        Cautam in text litera a
        Daca o gasim -> print am gasit litera + de cate ori exista in text
        daca nu o gasim printam ca nu am gasit litera
         */
        System.out.println("Adauga text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        int counter = 0; //variabila locala trebuie initializata

        char a = 'a';
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i)=='a'||text.charAt(i)=='A'){
                counter++;
            }
        }
        String result = counter == 0?"Letter a was not fount" : "Letter a was fount " + counter;
        System.out.println(result);
        scanner.close();


    }
}

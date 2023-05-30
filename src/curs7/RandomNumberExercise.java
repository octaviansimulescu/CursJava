package curs7;

import java.util.Random;

public class RandomNumberExercise {

    /*
    Facem un program care genereaza 6 numere intre 0-9
    le pune intr-un array
    nu tine numere duplcate
    printeaza array-ul

    metoda printeaza array
    metoda verifica daca numerele sunt duplicate
    metoda care genereaza nr si le pune in array
     */
    public static void main(String[] args) {
        RandomNumberExercise ex = new RandomNumberExercise();
        //ex.printArray();
        ex.printArray(ex.generateNumbers());
    }

    public final int LENGTH = 6;
    public final int MAX_NUMBERS= 9;
    public int[] generateNumbers(){

        int[] numbers = new int[LENGTH];
        Random random = new Random();
        int randomNr = 0;

        for (int i = 0; i<LENGTH; i++){

            do{
                randomNr=random.nextInt(MAX_NUMBERS);
            }while (checkDuplicate(numbers, randomNr));

            numbers[i]=randomNr;
        }

        return numbers;
    }

    public boolean checkDuplicate(int[] array, int nr) {
        for (int number : array) {
            if (number == nr) {
                return true;
            }
        } return false;
    }
    public void printArray(int[] array){
        /*for (int i=0; i < LENGTH; i++){
            System.out.println(array[i]);
        }*/
        for (int nr: array){
            System.out.println(nr);
        }
    }


}

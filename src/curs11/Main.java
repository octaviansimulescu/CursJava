package curs11;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CaloriiLegume caloriiLegume = new CaloriiLegume();
        caloriiLegume.writeCaloriesPropertiesFile();
        caloriiLegume.readCaloriesPropertiesFile("ceapa");
    }

}

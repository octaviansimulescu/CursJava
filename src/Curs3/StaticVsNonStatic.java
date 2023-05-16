package Curs3;

public class StaticVsNonStatic {

    //variabila statica (de clasa) - nu e asociata cu instanta clasei
    public static String nume;

    //variabila de instanta
    public String prenume;

    //metoda statica
    public static void printStatic(){
        System.out.println("Static");
    }

    //metoda de instanta
    public static void printNormal(){
        System.out.println("print Normal");
    }


}

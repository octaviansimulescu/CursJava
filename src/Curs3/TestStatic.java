package Curs3;

public class TestStatic {

    public static void main(String[] args) {

        StaticVsNonStatic obj = new StaticVsNonStatic();
        //apelare variabila intantiata
        obj.prenume = "Ceva";

        //apelare variabila statica
        StaticVsNonStatic.nume="Altceva";
        // obj.nume = "Altceva";

        //apelare metoda intantiata
        obj.printStatic();

        //apelare metoda statica
        StaticVsNonStatic.printNormal();
        //obj.printNormal();

    }

}

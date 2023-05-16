package Curs3;

public class StaticVsNonStatic2 {

    public static String nume;

    public static void main(String[] args) {
    StaticVsNonStatic obj = new StaticVsNonStatic();
    obj.nume = "Johnny";
        System.out.println(obj.nume);
        StaticVsNonStatic obj2 = new StaticVsNonStatic();
        obj.nume = "Dora";
        System.out.println(obj2.nume);
        System.out.println("------------------------");
        System.out.println(obj.nume);
        System.out.println(obj2.nume);
        //in a 2a parte printeaza de 2 ori Dora pt ca exista o singura locatie in memorie si cand ii atribuim o noua valoare de fapt o suprascriem
        //staticul se foloseste cand ai obiecte care raman aceleasi de la inceput
        //instantele se fac cu obiecte diferite in locatii diferite
    }
}

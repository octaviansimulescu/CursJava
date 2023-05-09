package Curs1;

public class Tester {

    private String nume;
    public int ratePerHour; //poate fi apelata direct din alta clasa

    public String getNume(){
        return nume;
    }
//citeste valoarea unei variablie
    public void setNume(String nume){
        this.nume=nume;
    }
//seteaza valoarea unei variablie

    //encapsulare = functionalitati de care nu stim cum functioneaza, dar stim cu ce ne ajuta

    //Tester obj = new Tester();
    /*
     * Tester --Numele clasei
     * obj - numele obiect
     * =  - operator de atriburie
     * new - cuvant cheie in java care ne ajuta sa instantiem o clasa
     * Tester() - constructor
     */

    //Tester obj = new Tester();
    // obj.setNume("Oana");

    //constructor
    public Tester(String nume, int ratePerHour){
        setNume(nume);
        this.ratePerHour =ratePerHour;
    }
/*
public Tester(String nume, int rate){
        setNume(nume);
        ratePerHour =rate;  daca rate de sus are nume diferit de variabila, nu mai trebuie sa ii pui this
 */
}

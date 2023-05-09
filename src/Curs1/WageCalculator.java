package Curs1;

public class WageCalculator {

    int weekHours = 40;

    public static void main(String[] args) {  //e apelata inainte de crearea obiectului din clasa

        Tester tester1 = new Tester("Oana",30);

       /* tester1.setNume("Oana");
        tester1.ratePerHour = 30;*///atribuire directa - lasa loc de erori
        System.out.println(tester1.getNume());

        Tester tester2 = new Tester("Ioana", 25);
        /*tester2.setNume("Ioana");
        tester2.ratePerHour = 25;*/
        System.out.println(tester2.getNume());

        WageCalculator obj = new WageCalculator();
        //calculator.calculateWage(0);
        System.out.println("Salariul lui " + tester1.getNume() + " este " + obj.calculateWage(tester1.ratePerHour));
    }

    public int calculateWage(int ratePerHours){
        return weekHours * ratePerHours;
    }


    //@Test - face call catre metoda psvm - chit ca e junit sau testng
    //@Before / @After etc nu face call catre main
}

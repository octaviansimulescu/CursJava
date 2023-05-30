package curs7;

public class TestWildAnimal extends Deer{
    public static void main(String[] args) {
       /* WildAnimal animal = new WildAnimal();
        animal.makeSound();

        System.out.println("===============================");
        Deer bambi = new Deer();
        bambi.makeSound();
        bambi.eatGrass();

        System.out.println("===============================");
        Lion simba = new Lion();
        simba.makeSound();
        simba.eatMeat();*/

        //WebDriver driver = new ChromeDriver();
        /*
       WildAnimal este mostenitn de Lion
        aici apare relatia Lion is an EildAnimal
        Java imi permite sa fac obiectul Lion de tip
        WildAnimal, pentru ca Lion is an WildAnimal
         */
        //data type
          WildAnimal simba = new Lion();
          simba.makeSound();
    //simba.eatMEat(); - nu merge
        ((Lion)simba).eatMeat();

    }

}

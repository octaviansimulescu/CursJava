package Curs3;



public class MainTema3 {
    public static void main(String[] args) {

        VerificareVarsta varsta = new VerificareVarsta();
        varsta.tellAge();
        varsta.checkAge();

    PunctajTest punctaj = new PunctajTest();
    punctaj.askTestScore();
    punctaj.examPassed();

        Today today = new Today();
        today.selectDay();
        today.tellDay();
    }

}

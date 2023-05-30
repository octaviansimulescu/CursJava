package curs7;

public class TestMostenire {
    public static void main(String[] args) {
        /*Tester obj = new Tester();
        obj.setEmail(null);*/

        //Angajat -> Tester -> TesterAutomat

        TesterAutomat obj = new TesterAutomat();
        obj.setProgrammingLang("Java");//clasa testeru automat
        obj.setDepartament("QA");//clasa Tester
        obj.setSeniority("Junior");//clasa Tester
        obj.setEmail("maria@gmail");//clasa Angajat
        obj.setNume("MAria");//clasa Angajat

    }

}

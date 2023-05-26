package curs6;

public class ArrayExample {
    public static void main(String[] args) {
        String[]textArray = new String[5];
        //String[] textArray = {null,null,null,null,null}
        //index:                  0    1    2    3    4
        System.out.println(textArray[1]);
        textArray[1]="Maria";
        //String[] textArray = {null,Maria,null,null,null}
        System.out.println(textArray[1]);

        try {
            System.out.println(textArray[5]);
        }catch (Exception e){
            System.out.println("Ai incercat ssa accesezi in afara arrayului");
        }
        System.out.println("Alt cod");
    }
}

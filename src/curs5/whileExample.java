package curs5;

public class whileExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("for " + i);
        }

        int j =0; //se initializeaza variabila afara
        while (j<5){
            System.out.println("While "+j);
            j++;
        }
    }
}

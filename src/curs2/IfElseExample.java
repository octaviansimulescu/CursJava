package curs2;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        String username = "Test";
        int password = 1234;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Te rog introdu username :" );
        String inputUsername = scanner.next();
        System.out.println("Parola :");
        int inputPassword = scanner.nextInt();
        inputUsername = inputUsername.substring(0,1).toUpperCase()+inputUsername.substring(1).toLowerCase();

        if (username.equals(inputUsername) && password == inputPassword){
            System.out.println("login successful");
        }else{
            System.out.println("Wrong user");
        }
        //Stringurile se duc in string pool - acolo java optimizeaza memoria
        //== face verificare in memorie pt stringuri
        //.equals verifica caracaterele

    }
}

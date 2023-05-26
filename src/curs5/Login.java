package curs5;

import java.util.Scanner;

public class Login {

    public void userLogin(){
        Scanner scanner = new Scanner(System.in);
        String user;
        String password;

        boolean successfulLogin = false;
        int counter=0;
        do{
            System.out.printf("Enter user: ");
             user = scanner.next();
            System.out.printf("Enter password: ");
             password = scanner.next();
            if(user.equals("TestUser") && password.equals("1234")){
                System.out.println("Login Successful");
                successfulLogin=true;
            }else {
                System.out.println("Login Error");
                counter++;
            }
            if (counter>2){
                System.out.println("Maximum attempts reached. User blocked");
                break;
            }
        }while (!successfulLogin);

    }
}

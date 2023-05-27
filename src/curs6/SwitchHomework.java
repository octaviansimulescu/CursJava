package curs6;

import java.util.Scanner;

public class SwitchHomework {

    public static void main(String[] args) {
        SwitchHomework tema = new SwitchHomework();
        tema.givingBonus();
    }

    public void givingBonus() {
        int bonus;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adaugati anul de vechime in firma: ");
        int vechime = scanner.nextInt();
        System.out.println("Adaugati valorea vanzarilor efectuate ");
        int valoare = scanner.nextInt();
        System.out.println("Adaugati luna vanzarilor");
        int luna = scanner.nextInt();
        switch (vechime) {
            case 1: {
                System.out.println("Bonusul dvs este " + 100);
                break;
            }
            case 2: {
                System.out.println("Bonusul dvs este " + 200);
                break;
            }
            case 3: {
                if (valoare <= 5000) {
                    System.out.println("Bonusul dvs este " + 600);
                } else if (valoare <= 10000) {
                    switch (luna) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6: {
                            System.out.println("Bonusul dvs este " + 800);
                            break;
                        }
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11: {
                            System.out.println("Bonusul dvs este " + 1000);
                            break;
                        }
                        default:
                            System.out.println("Bonusul dvs este " + 900);
                            System.out.println("in decembrie se vand singure");
                    }
                } else {
                    System.out.println("Bonusul dvs este " + 1200);
                }break;
            } default:{
                System.out.println("Tzeapa");
            }
        }
    }
}


package curs2;

public class TestRectagle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,6);
        System.out.println("Aria e "+ rectangle1.calculateAria());

        Rectangle rectangle2 = new Rectangle(9,5);
        System.out.println("Aria e "+ rectangle2.calculateAria());
    }
}

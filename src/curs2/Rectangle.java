package curs2;

public class Rectangle {
    private int lenght;
    private int width;

    public Rectangle(int lenght, int width){
        this.lenght=lenght;
        this.width=width;
//obliga de la instantiere ca cei 2 params
    }

    public int calculateAria(){
        return lenght*width;
    }
}

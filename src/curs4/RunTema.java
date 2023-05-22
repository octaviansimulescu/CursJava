package curs4;

public class RunTema {

    public static void main(String[] args) {
        Tema ex1 = new Tema();
        ex1.discountFactura(93);
        System.out.println(ex1.pretDupaDiscount);


        int comision;
        int vanzari = 3500;
        if(vanzari > 2500){
            comision= vanzari * 5/100;
        }else
            comision=0;
        System.out.println("Comisionul tau este:" + comision);

        Tema ex3 = new Tema();
        ex3.introduCalificativ();


        Tema ex4 = new Tema();
        ex4.addNumbers();

        Tema ex5 = new Tema();
        ex5.multiplyNumbers();
    }
}

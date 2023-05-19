package curs4;

public class Palindrom {

    public static void main(String[] args) {

        checkPalindrom("masina");
    }

    public static void checkPalindrom(String cuvant){
        String revers="";
        for (int i = cuvant.length() -1; i >= 0; i-- )
    // revers = revers + cuvant.charAt(i);
        revers+=cuvant.charAt(i);
        String result = cuvant.equals(revers)?"Este palindrom":"Nu este palindrom";
        System.out.println(result);
        System.out.println(revers);
    }
}

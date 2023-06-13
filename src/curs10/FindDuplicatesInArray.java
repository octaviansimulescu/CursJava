package curs10;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

    public static void main(String[] args) {
        String[] myStringArray = {"Oana","Ion","Bogdan","Ion","Maria","Oana"};
        //index                     0       1       2     3      4      5
        for (int i = 0;i<myStringArray.length;i++){
            for (int j = i+1;j< myStringArray.length; j++){
                if(myStringArray[i].equals(myStringArray[j])){
                    System.out.println(myStringArray[i] + " e duplicat");
                }
            }
        }


        System.out.println("====================");
        Set<String> duplicat = gasescDuplicate(myStringArray);
        for (String nume:duplicat){
            System.out.println("Nume duplicat " + nume);
        }

    }
    public static Set<String>gasescDuplicate(String[]myStringArray){
        Set<String>numeDuplicat = new HashSet<>();
        for (int i = 0;i<myStringArray.length;i++){
            for (int j = i+1;j< myStringArray.length; j++){
                if(myStringArray[i].equals(myStringArray[j])){
                    System.out.println(numeDuplicat.add(myStringArray[i]));
                }
            }
        }
    return numeDuplicat;
    }
}

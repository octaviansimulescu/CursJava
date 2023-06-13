package curs10;

public class StringBuilderExample {
    public static void main(String[] args) {
        reverseString("masina");
        replaceFromString("Salut Bogdan");
       deleteFromString("enciclopedie");
       insertIntoString("Bogdan");
       addSpacesToText("thisIsACamelCaseText");
    }

    public static void reverseString(String text){
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }

    public static void replaceFromString(String text){
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.replace(6,12,"oana");
        System.out.println(stringBuilder);
    }
    public static void deleteFromString(String text){
        StringBuilder sb = new StringBuilder(text);
        sb.delete(2,9);
        System.out.println(sb);
    }

    public static void insertIntoString(String text){
        StringBuilder stringBuilder =new StringBuilder(text);
        System.out.println(stringBuilder);
        stringBuilder.insert(0,"Salut ");
        System.out.println(stringBuilder);
    }

    //thisIsACamelCaseText
    public static void addSpacesToText(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        System.out.println(stringBuilder);

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (Character.isUpperCase(stringBuilder.charAt(i))) {
            stringBuilder.insert(i, " ");
            i++;
        }
    }
        System.out.println(stringBuilder);
    }
}

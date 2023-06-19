package curs11;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class CaloriiLegume {

    public void writeCaloriesPropertiesFile() {
        try {
        OutputStream outputStream = new FileOutputStream("calories.properties");
            Properties properties = new Properties();
            String leguma;
            String calorii;
            properties.setProperty("morcov","58");
            properties.setProperty("castravete","33");
            properties.setProperty("conopida","81");
            properties.setProperty("varza","92");
            properties.setProperty("ceapa","42");

            properties.store(outputStream,"Am salvat numarul de calorii");
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readCaloriesPropertiesFile(String leguma){
        try {
            InputStream inputStream = new FileInputStream("calories.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            String calories = properties.getProperty(leguma);

            if(properties.containsKey(leguma)) {
                System.out.println(leguma + " are " + calories + " calorii ");
            }else {
                System.out.println("Nu vindem aceasta leguma");
            }

            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();

        }
    }


}

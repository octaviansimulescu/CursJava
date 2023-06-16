package curs11;

import java.io.*;
import java.util.Properties;

public class PropertiesFileProcessor {

    public void writePropertiesFile() {
        try {
            OutputStream outputStream = new FileOutputStream("test.properties"); //scot in afara programului
            Properties propFile = new Properties();
            propFile.setProperty("user", "testuser");
            propFile.setProperty("pass", "pass1234");
            propFile.setProperty("email", "testuser@test.com");
            propFile.store(outputStream, "am salvat fisier properties");
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        //InputStream pt a aduce in interiorul programului
    }

    public void readProperties(String key) {
        //try cu resurse
        try (FileInputStream inputStream = new FileInputStream("test.properties")) {//inputStream e clasa parinte pt FileInputStream
            Properties prop = new Properties(); //faci obiectul in clasa copil
            prop.load(inputStream);

            String value = prop.getProperty(key);
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updatePropertiesFile(String key, String value){
        Properties prop = new Properties();
        //citesc fisierul
        try (FileInputStream inputStream = new FileInputStream("test.properties")) {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStream output = new FileOutputStream("test.properties")) { //scot in afara programului)
            prop.setProperty(key, value);
            prop.store(output, null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void deleteFromPropertiesFile(String key){
        Properties prop = new Properties();
        //citesc fisierul
        try (FileInputStream inputStream = new FileInputStream("test.properties")) {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
//salvez noile modificari
        try (OutputStream output = new FileOutputStream("test.properties")) { //scot in afara programului)
            prop.remove(key);//sterge cheia si valoarea asociata
            prop.store(output, null);//salveaza modificarile pe output stream

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

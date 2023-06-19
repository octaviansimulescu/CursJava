package curs11;

import java.io.FileNotFoundException;
import java.io.IOException;

public class testPropertiesFile {
    public static void main(String[] args) throws IOException {
        PropertiesFileProcessor obj = new PropertiesFileProcessor();
        obj.writePropertiesFile();
        obj.readProperties("djasjd");/*
        obj.readProperties("pass");
        obj.readProperties("email");
        obj.updatePropertiesFile("user","admin");
        obj.updatePropertiesFile("pass","admin123");
        System.out.println("===============");
        obj.deleteFromPropertiesFile("email");*/
    }
}

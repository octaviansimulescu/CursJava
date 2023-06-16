package curs11;

import java.io.IOException;

public class TestTextFileProcessor {
    public static void main(String[] args) throws IOException {
        TextFileProcessor obj = new TextFileProcessor();
        /*obj.writeFile("Bla bla bla 2\n");
        obj.readFile();
        obj.updateFile("Capybara");
        obj.readFile();*/
        obj.deleteLineFromFile("Capybara","");
        obj.readFile();

    }
}

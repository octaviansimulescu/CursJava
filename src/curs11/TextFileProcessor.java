package curs11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextFileProcessor {
    //write txt file
    public void writeFile(String textToWrite){
        try (FileWriter fileWriter =  new FileWriter("file.txt")){
            fileWriter.write(textToWrite);
            //fileWriter.close();
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //read txt file
    public void readFile(){
        File obj = new File("file.txt");
        try {
            Scanner scanner = new Scanner(obj);
            //citim tot fisierul
            while (scanner.hasNext()){//has next citeste urmatorul obiect
            String text = scanner.nextLine();
                System.out.println(text);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateFile(String textToAdd){
        try (FileWriter fileWriter =  new FileWriter("file.txt",true)){//metoda de write cu append=true
            fileWriter.write(textToAdd);

            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteLineFromFile(String deleteText,String textToReplace) throws IOException{
        String data = "";
        data = new String(Files.readAllBytes(Paths.get("file.txt")));
        try (FileWriter fileWriter =  new FileWriter("file.txt")){//metoda de write cu append=true
            data = data.replaceAll(deleteText,textToReplace);
            fileWriter.write(data);

            System.out.println("Successfully deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

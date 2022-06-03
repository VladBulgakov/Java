package Lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<String> fileToList(File input){
        List<String> output = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(input))){
            String line;
            while ((line = reader.readLine()) != null){
                output.add(line);
            }
        } catch (IOException e){
            System.out.println("Ошибка!\n" + e.getMessage());
        }
        return output;
    }
}

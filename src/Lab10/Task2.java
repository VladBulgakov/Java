package Lab10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void writeText(File target, String text){
        try (FileWriter writer = new FileWriter(target)){
            writer.write(text);
            writer.flush();
        } catch (IOException e){
            System.out.println("Ошибка!\n" + e.getMessage());
        }
    }
}

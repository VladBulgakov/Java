package Lab10;

import java.io.*;

public class Task3 {
    public static void mergeFiles(File input1, File input2, File target){
        try(BufferedReader reader1 = new BufferedReader(new FileReader(input1));
            BufferedReader reader2 = new BufferedReader(new FileReader(input2));
            FileWriter writer = new FileWriter(target);){
            String line;
            while ((line = reader1.readLine()) != null){
                writer.append(line);
                writer.append("\n");
            }
            while ((line = reader2.readLine()) != null){
                writer.append(line);
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException e){
            System.out.println("Ошибка!\n" + e.getMessage());
        }
    }
}

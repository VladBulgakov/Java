package Lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task4 {
    public static void replaceSymbols(File file){
        List<String> content = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                content.add(line.replaceAll("[^а-яА-Яa-zA-Z\\d]", "\\$"));
            }
            reader.close();
            file.delete();
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            ListIterator<String> listIterator = content.listIterator();
            while (listIterator.hasNext()){
                writer.append(listIterator.next());
                writer.append("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e){
            System.out.println("Ошибка!\n" + e.getMessage());
        }
    }
}

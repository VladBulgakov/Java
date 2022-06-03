package Lab10;

import java.io.File;

public class Main {
    public static void main(String args[]){
        task4Test();
    }

    public static void task1Test(){
        File input = new File("D:\\textinput.txt");
        System.out.println(Task1.fileToList(input));
    }

    public static void task2Test(){
        File output = new File("D:\\textoutput.txt");
        Task2.writeText(output,"Это предложение будет записано в файл");
    }

    public static void task3Test(){
        File input1 = new File("D:\\textinput.txt");
        File input2 = new File("D:\\textoutput.txt");
        File output = new File("D:\\merged.txt");
        Task3.mergeFiles(input1, input2, output);
    }

    public static void task4Test(){
        File file = new File("D:\\textinput.txt");
        Task4.replaceSymbols(file);
    }
}

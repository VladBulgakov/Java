package Lab5;

import java.util.Scanner;

public class Task5 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = console.nextLine();
        System.out.println("Строка с инвертированными словами: ");
        System.out.println(wordInversion(input));
    }

    private static String wordInversion(String input){
        StringBuilder resultSb = new StringBuilder();
        StringBuilder tmpSb = new StringBuilder();
        String[] words = input.trim().split(" ");
        for (int i = 0; i < words.length; i++){
            tmpSb.append(words[i]);
            tmpSb.reverse();
            resultSb.append(tmpSb + " ");
            tmpSb.delete(0, tmpSb.length());
        }
        return resultSb.toString().substring(0, resultSb.toString().length()-1);
    }
}

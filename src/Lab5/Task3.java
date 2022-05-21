package Lab5;

import java.util.Scanner;

public class Task3 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String input = console.nextLine();
        System.out.println("Фраза после цензуры: ");
        System.out.println(performCensorship(input));
    }

    private static String performCensorship(String input){
        String result = input.replaceAll("\\b[Бб][Яя][Кк][Аа]\\b", "[вырезано цензурой]");
        return result;
    }
}

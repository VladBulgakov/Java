package Lab5;

import java.util.Scanner;

public class Task1 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = console.nextLine();
        System.out.println("Самое длинное слово: " + findLongestWord(input));
    }

    private static String findLongestWord(String input){
        String[] strings = input.trim().split(" ");
        int maxLength = 0;
        int longestWordIndex = 0;
        for (int i = 0; i < strings.length; i++)
        {
            if (strings[i].length() > maxLength){
                maxLength = strings[i].length();
                longestWordIndex = i;
            }
        }
        return strings[longestWordIndex];
    }
}

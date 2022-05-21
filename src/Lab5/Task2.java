package Lab5;

import java.util.Scanner;

public class Task2 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String input = console.nextLine();
        System.out.println("Слово является палиндромом: " + isPalindrome(input));
    }

    private static boolean isPalindrome(String input){
        boolean isPal = true;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if (charArray[i] != charArray[charArray.length-1-i]){
                isPal = false;
            }
        }
        return isPal;
    }
}

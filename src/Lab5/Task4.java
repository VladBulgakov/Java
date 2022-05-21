package Lab5;

import java.util.Scanner;

public class Task4 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String mainString = console.nextLine();
        System.out.println("Введите строку, которая должна входить в первую: ");
        String substring = console.nextLine();
        System.out.println("Количество вхождений: " + stringOccurrences(mainString, substring));
    }

    private static int stringOccurrences(String mainString, String substring){
        int counter = 0;
        while (mainString.contains(substring)){
            mainString = mainString.replaceFirst(substring, "");
            counter++;
        }
        return counter;
    }
}

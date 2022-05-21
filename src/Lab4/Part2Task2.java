package Lab4;

import java.util.Arrays;
import java.util.Scanner;

//Часть 2 задание 2.
public class Part2Task2 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i<size; i++){
            array[i] = console.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}

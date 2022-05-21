package Lab4;

import java.util.Arrays;
import java.util.Scanner;

//Часть 2 задание 3.
public class Part2Task3 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i<size; i++){
            array[i] = console.nextInt();
        }
        System.out.println("Array 1: " + Arrays.toString(array));
        swapElements(array);
        System.out.println("Array 2: " + Arrays.toString(array));
    }

    private static void swapElements(int[] array){
        int tmp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = tmp;
    }
}

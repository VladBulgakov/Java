package Lab4;

import java.util.Scanner;

//Часть 2 задание 4.
public class Part2Task4 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i<size; i++){
            array[i] = console.nextInt();
        }
        findUnique(array);
    }

    private static void findUnique(int[] array){
        boolean isUnique;
        for (int i = 0; i < array.length; i++){
            isUnique = true;
            for (int j = 0; j < array.length; j++){
                if (i == j) continue;
                if (array[i] == array[j]){
                    isUnique = false;
                }
            }
            if (isUnique){
                System.out.println("Первое уникальное значение: " + array[i]);
                return;
            }
        }
    }
}

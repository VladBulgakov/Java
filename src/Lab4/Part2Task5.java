package Lab4;

import java.util.Arrays;
import java.util.Scanner;

//Часть 2 задание 5.
public class Part2Task5 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i<size; i++){
            array[i] = console.nextInt();
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int leftBound, int rightBound){
        if (leftBound >= rightBound){
            return;
        }
        int middle = leftBound + (rightBound - leftBound) / 2;
        mergeSort(array, leftBound, middle);
        mergeSort(array, middle + 1, rightBound);
        mergeArrays(array, leftBound, rightBound, middle);
    }

    private static void mergeArrays(int[] input, int leftBound, int rightBound, int middle){
        if (leftBound >= rightBound || middle < leftBound || middle > rightBound){
            return;
        }
        if (rightBound == leftBound + 1 && input[leftBound] > input[rightBound]){
            int tmp = input[leftBound];
            input[leftBound] = input[rightBound];
            input[rightBound] = tmp;
        }
        int[] buf = new int[];
        System.arraycopy(input, 2, );
        int index1 = leftBound;
        int index2 = middle;
        int iterationCount = rightBound - leftBound;
        for (int i = leftBound; i <= rightBound; i++){

        }
    }
}

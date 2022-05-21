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
        mergeSort(array, array.length);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int length){
        if (length < 2){
            return;
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        for (int i = 0; i < middle; i++){
            leftArray[i] = array[i];
        }
        for (int i = middle; i < length; i++){
            rightArray[i - middle] = array[i];
        }
        mergeSort(leftArray, middle);
        mergeSort(rightArray, length - middle);
        merge(array, leftArray, rightArray, middle, length - middle);
    }

    public static void merge(int[] targetArray, int[] leftArray, int[] rightArray, int leftSize, int rightSize){
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize){
            if (leftArray[i] <= rightArray[j]){
                targetArray[k] = leftArray[i];
                k++;
                i++;
            }
            else{
                targetArray[k] = rightArray[j];
                k++;
                j++;
            }
        }
        while (i < leftSize){
            targetArray[k] = leftArray[i];
            k++;
            i++;
        }
        while (j < rightSize){
            targetArray[k] = rightArray[j];
            k++;
            j++;
        }
    }
}

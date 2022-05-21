package Lab4;

import java.util.Scanner;

//Часть 2 задание 1.
public class Part2Task1 {
    public static void app(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i<size; i++){
            array[i] = console.nextInt();
        }
        int[] sortedArray = getSortedArray(array);
        if (compareArrays(array, sortedArray)){
            System.out.println("ОК");
        } else{
            System.out.println("Please, try again");
        }
    }

    private static int[] getSortedArray(int[] input){
        int[] array = input.clone();
        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    private static boolean compareArrays(int[] input1, int[] input2){
        if (input1.length != input2.length){
            return false;
        } else{
            for (int i = 0; i < input1.length; i++){
                if (input1[i] != input2[i]){
                    return false;
                }
            }
            return true;
        }
    }
}

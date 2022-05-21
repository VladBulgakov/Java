package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов массива (2 и более): ");
        int size = console.nextInt();
        if (size < 2) return;
        int[] array = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i<size; i++){
            array[i] = console.nextInt();
        }
        Part1.task6(array);
    }
}

package Lab4;

import java.util.Scanner;

//Часть 1.
public class Part1 {

    //Вывести нечетные числа от 1 до 99
    public static void task1(){
        for (int i = 1; i<100; i=i+2){
            System.out.println(i);
        }
    }

    //Вывести числа от 1 до 100, которые делятся на 3, 5 и на то и другое
    public static void task2(){
        for (int i = 1; i<=100; i++){
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println("Делится на 3: " + i);
            }
            else if (i % 3 != 0 && i % 5 == 0){
                System.out.println("Делится на 5: " + i);
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Делится на 3 и на 5: " + i);
            }
        }
    }

    //Вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
    public static void task3(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = console.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = console.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = console.nextInt();
        System.out.println("Результат: " + (num1 + num2 == num3));
    }

    //Принять от пользователя три целых числа и вернуть true,
    // если второе число больше первого числа, а третье число больше второго числа
    public static void task4(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = console.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = console.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = console.nextInt();
        System.out.println("Результат: " + (num2 > num1 && num3 > num2));
    }

    //Проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
    // Длина массива должна быть больше или равна двум
    public static void task5(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов массива (2 и более): ");
        int size = console.nextInt();
        if (size < 2) return;
        int[] array = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i<size; i++){
            array[i] = console.nextInt();
        }
        String outputArray = "array = ";
        for (int i = 0; i<size; i++){
            outputArray += Integer.toString(array[i]) + ", ";
        }
        System.out.println(outputArray.substring(0,outputArray.length()-2));
        System.out.println(array[0] == 3 || array[size-1] == 3);
    }

    //Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
    public static void task6(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i<size; i++){
            array[i] = console.nextInt();
        }
        boolean numbersFound = false;
        String outputArray = "array = ";
        for (int i = 0; i<size; i++){
            outputArray += Integer.toString(array[i]) + ", ";
            if (array[i] == 1 || array[i] == 3){
                numbersFound = true;
            }
        }
        System.out.println(outputArray.substring(0,outputArray.length()-2));
        System.out.println(numbersFound);
    }
}

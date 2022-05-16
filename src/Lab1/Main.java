package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1(){
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }

    public static void task2(){
        float result1 = (46+10)*(10F/3F);
        int result2 = 29*4*(-15);
        System.out.println("Результат 1: ");
        System.out.println(result1);
        System.out.println(result2);
    }

    public static void task3(){
        int number = 2;
        float result = (number / 10F) / 10F;
        System.out.println("Результат 2: " + result);
    }

    public static void task4(){
        double result = 3.6*4.1*5.9;
        System.out.println("Результат 3: " + result);
    }

    public static void task5(){
        System.out.println("Введите числа...");
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        System.out.println("Результат 4: введены числа");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static void task6(){
        System.out.println("Введите число b...");
        Scanner console = new Scanner(System.in);
        int b = console.nextInt();
        if (b % 2 != 0){
            System.out.println("Нечетное");
        } else if (b % 2 == 0 && b > 100){
            System.out.println("Выход за пределы диапазона");
        }
        else{
            System.out.println("Четное");
        }
    }
}
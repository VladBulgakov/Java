package Lab6.Task5;

import java.util.Scanner;

public class AgeInput {
    Scanner console = new Scanner(System.in);

    public int input(){
        System.out.println("Введите возраст: ");
        return this.console.nextInt();
    }
}


/*
*       Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = console.nextInt();*/

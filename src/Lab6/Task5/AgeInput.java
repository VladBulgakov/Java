package Lab6.Task5;

import java.util.Scanner;

public class AgeInput {
    private Scanner console = new Scanner(System.in);
    //написать гетер для сканера
    public Scanner getScanner(){
        return this.console;
    }
    public int age;
    public void input(){
        System.out.println("Введите возраст: ");
        this.age = console.nextInt();
    }
}
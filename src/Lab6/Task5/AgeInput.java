package Lab6.Task5;

import java.util.Scanner;

public class AgeInput {
    Scanner console = new Scanner(System.in);
    public int age;

    public void input(){
        System.out.println("Введите возраст: ");
        this.age = console.nextInt();
    }
}
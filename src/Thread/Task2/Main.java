package Thread.Task2;

public class Main {
    public static void main(String args[]) throws InterruptedException{
        StatusCheckThread thread = new StatusCheckThread("Мой поток");
        System.out.println("Создан поток с именем: " + thread.getName());
        System.out.println("Статус потока до запуска: " + thread.getState());
        thread.start();
        System.out.println("Статус потока после запуска: " + thread.getState());
    }
}

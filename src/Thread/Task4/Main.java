package Thread.Task4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass base = new ThreadClass("base");
        new Thread(base, "Первый").start();
        new Thread(base, "Второй").start();
    }
}

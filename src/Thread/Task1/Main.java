package Thread.Task1;

public class Main {
    public static void main(String args[]){
        System.out.println("Запуск 10 потоков, каждый из которых выводит числа от 0 до 100");
        for(int i = 0; i < 10; i++){
            new NumberOutputThread().start();
        }
    }
}

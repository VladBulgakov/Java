package Thread.Task3;

public class Main {
    public static void main(String args[]) throws InterruptedException{
        Counter counter = new Counter();
        IncrementCallThread[] threads = new IncrementCallThread[100];
        //Создаем и запускаем потоки
        for(int i = 0; i < 100; i++){
            threads[i] = new IncrementCallThread(counter);
            threads[i].start();
        }
        //Указываем, что не будем выводить результат, пока они не будут выполнены
        for(int i = 0; i < 100; i++){
            threads[i].join();
        }
        //Вывод результата
        System.out.println("Значение счетчика: " + counter.getCount());
    }
}

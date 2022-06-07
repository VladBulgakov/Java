package Thread.Task3;

public class Counter {
    int count = 0;

    //Необходимо указать, что выполнение кода, написанного в методе, должно быть синхронизирован между потоками
    //Для этого служит synchronized
    /*public synchronized void increment() {
        count = count + 1;
    }*/

    //Или так
    public void increment() {
        synchronized(this) { //Синхронизация по данному объекту класса Counter, к которому и принадлежит поле count
            count = count + 1;
        }
    }

    public int getCount() {
        return count;
    }
}

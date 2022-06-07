package Thread.Task3;

public class IncrementCallThread extends Thread{
    Counter counter;

    public IncrementCallThread(Counter cnt){
        this.counter = cnt;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++) {
            this.counter.increment();
        }
    }
}

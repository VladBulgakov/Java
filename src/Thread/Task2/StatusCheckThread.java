package Thread.Task2;

public class StatusCheckThread extends Thread{
    public StatusCheckThread(String name){
        super(name);
    }

    @Override
    public void run(){
        double tmp = 0;
        for(int i = 0; i <= 100000; i++){
            tmp += i/123.333+2;
        }
        tmp = 0;
        System.out.println("Статус потока во время выполнения: " + this.getState());
        for(int i = 0; i <= 100000; i++){
            tmp += i/123.333+2;
        }
    }
}

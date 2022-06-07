package Thread.Task4;

public class ThreadClass extends Thread{
    volatile String lastPrintedName = "";

    public ThreadClass(String name){
        super(name);
    }

    @Override
    public void run(){
        while(true){
            printName();
        }
    }

    public synchronized void printName(){
        while(this.lastPrintedName.equals(Thread.currentThread().getName())){
            try{
                wait();
            } catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        this.lastPrintedName = Thread.currentThread().getName();
        System.out.println("Мое имя " + this.lastPrintedName);
        notify();
    }
}

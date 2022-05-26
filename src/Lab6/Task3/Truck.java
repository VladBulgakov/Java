package Lab6.Task3;

public class Truck extends Car{
    private int wheels;
    private int weightLimit;

    public Truck(String model, char color, float speed, int wheels, int weight, int weightLimit){
        super(weight, model, color, speed);
        this.wheels = wheels;
        this.weightLimit = weightLimit;
    }

    public void newWheels(int nWheels){
        this.wheels = nWheels;
        System.out.println("Новое значение числа колес установлено! Теперь оно равно " + this.wheels);
    }
}

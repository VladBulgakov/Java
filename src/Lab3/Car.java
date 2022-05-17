package Lab3;

public class Car {
    public String color;
    public String model;
    public double weight;

    public Car(){
    }

    public Car(String color){
        this.color = color;
    }

    public Car(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println("Цвет: " + this.color + "; Модель: " + this.model + "; Масса: " + this.weight + " тонн");
    }
}

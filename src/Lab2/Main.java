package Lab2;

import Lab2.Calculator.Calculator;
import Lab2.Plane.Plane;

public class Main {
    public static void main(String[] args){
        //Тест калькулятора
        double t = Calculator.div(2,3);
        System.out.println("Результат: " + t);

        //Тест класса Plane
        Plane plane1 = new Plane();
        plane1.cost = 50000000;
        System.out.println(plane1);
        Plane plane2 = new Plane("Boeing", "737-800 NG", 73000000);
        System.out.println(plane2);
        plane2.fly(120);
        plane2.fly(300);
        plane2.getOperatingTime();
        Plane.getPlanesCount();
    }
}
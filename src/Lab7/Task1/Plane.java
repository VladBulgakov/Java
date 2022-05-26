package Lab7.Task1;

import java.util.Scanner;

public class Plane {
    public class Wing{
        private int weight;

        public void setWeight(int weight){
            this.weight = weight;
        }

        public void showWeight(){
            System.out.println("Вес крыла: " + this.weight);
        }
    }
}

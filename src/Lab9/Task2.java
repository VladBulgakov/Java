package Lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
    /*public static void fillArrayList(ArrayList target){
        for (int i = 0; i < 999999; i++){
            Random random = new Random();
            target.add(random.ints(0, 10).findFirst().getAsInt());
        }
    }

    public static void fillLinkedList(LinkedList target){
        for (int i = 0; i < 999999; i++){
            Random random = new Random();
            target.add(random.ints(0, 10).findFirst().getAsInt());
        }
    }*/

    public static void fillList(List target){
        for (int i = 0; i < 999999; i++){
            Random random = new Random();
            target.add(random.ints(0, 10).findFirst().getAsInt());
        }
    }

    public static void getElement(List input){
        int value;
        for (int i = 0; i < 99999; i++){
            Random random = new Random();
            value = (int)input.get(random.ints(0, 999999).findFirst().getAsInt());
        }
    }
}

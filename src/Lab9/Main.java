package Lab9;

import java.util.*;

public class Main {
    public static void main(String args[]){
        testTask1();
    }

    public static void testTask1(){
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(5);
        data.add(5);
        List<Integer> result = new ArrayList<Integer>();
        result = Task1.removeRepeats(data);
        System.out.println(result);
    }

    public static void testTask2(){
        ArrayList<Integer> dataArray = new ArrayList<Integer>();
        LinkedList<Integer> dataLinked = new LinkedList<Integer>();
        long startTime = System.currentTimeMillis();
        Task2.fillList(dataArray);
        Task2.getElement(dataArray);
        long endTime = System.currentTimeMillis();
        System.out.println("На работу с ArrayList ушло " + (endTime - startTime) + " миллисекунд");
        startTime = System.currentTimeMillis();
        Task2.fillList(dataLinked);
        Task2.getElement(dataLinked);
        endTime = System.currentTimeMillis();
        System.out.println("На работу с LinkedList ушло " + (endTime - startTime) + " миллисекунд");
        //На работу с ArrayList ушло 155 миллисекунд, на работу с LinkedList ушло 144735 миллисекунд
        //Доступ к случайным элементам списка, в случае с LinkedList, занимает много времени
    }

    public static void testTask3(){
        Map<User, Integer> gameData = new HashMap<>();
        gameData.put(new User("Дима"), 100);
        gameData.put(new User("Слава"), 200);
        gameData.put(new User("Иван"), 150);
        gameData.put(new User("Маша"), 210);
        Task3.getScore(gameData);
    }
}

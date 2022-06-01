package Lab9;

import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void getScore(Map<User, Integer> data){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = console.nextLine();
        System.out.println("У пользователя " + name + " " + data.get(getUser(data, name)) + " очков.");
    }

    private static User getUser(Map<User, Integer> data, String name){
        User thisUser = new User("noname");
        for(Map.Entry<User, Integer> entry: data.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(name)){
                thisUser = entry.getKey();
            }
        }
        return thisUser;
    }
}

package Lab6.Task4;

public class Main {
    public static void main(String[] args) {
        Child object = new Child(); //Объект базового класса, созданный конструктором класса-наследника
        object.value = 5;
        System.out.println("Значение поля value: " + object.getValue());
    }
}

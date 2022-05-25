package Lab6.Task5;

public class Main {
    public static void main(String args[]) {
        NameInput nameInput = new NameInput();
        nameInput.input();
        System.out.println("Вы ввели имя " + nameInput.name);
    }
}

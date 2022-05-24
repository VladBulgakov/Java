package Lab6.Task2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Иван", "Иванов", "Сбербанк");
        emp1.humanInfo();
        Client cl1 = new Client("Петр", "Петров", "Сбербанк");
        cl1.humanInfo();
        cl1.speak("Здравствуйте! Поможете открыть вклад?");
        emp1.speak("Добрый день. Подходите, я помогу вам");
        cl1.doSomething();
        emp1.doSomething();
    }
}
package Lab6.Task2;

public class Employee extends Human implements Acting{
    private String bankTitle;

    public Employee(String firstName, String lastName, String bankTitle){
        this.bankTitle = bankTitle;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void humanInfo(){
        System.out.println("Информация: " + getFirstName() + " " + getLastName() +
                " - работник банка " + this.bankTitle);
    }

    public void speak(String phrase){
        System.out.println("Работник банка " + this.lastName + " " + this.firstName + " говорит: " + phrase);
    }

    public void doSomething(){
        System.out.println("<" + this.lastName + " " + this.firstName + " помогает посетителю>");
    }
}

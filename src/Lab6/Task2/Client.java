package Lab6.Task2;

public class Client extends Human implements Acting{
    private String bankTitle;

    public Client(String firstName, String lastName, String bankTitle){
        this.bankTitle = bankTitle;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void humanInfo(){
        System.out.println("Информация: " + this.firstName + " " + this.lastName +
                " - клиент банка " + this.bankTitle);
    }

    public void speak(String phrase){
        System.out.println("Клиент банка " + this.lastName + " " + this.firstName + " говорит: " + phrase);
    }

    public void doSomething(){
        System.out.println("<" + this.lastName + " " + this.firstName + " идет к работнику банка открывать вклад>");
    }
}

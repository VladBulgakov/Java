package Lab6.Task1;

public class Client extends Human{
    private String bankTitle;

    public Client(String firstName, String lastName, String bankTitle){
        this.bankTitle = bankTitle;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void humanInfo(){
        System.out.println("Информация: " + getFirstName() + " " + getLastName() +
                " - клиент банка " + this.bankTitle);
    }
}

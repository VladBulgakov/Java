package Lab6.Task1;

public class Employee extends Human{
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
}

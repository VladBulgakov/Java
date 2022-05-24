package Lab6.Task2;

public abstract class Human {
    protected String firstName;
    protected String lastName;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    abstract void humanInfo();

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(){

    }
}

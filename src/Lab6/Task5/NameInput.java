package Lab6.Task5;

public class NameInput extends AgeInput{
    @Override
    public String input(){
        System.out.println("Введите имя: ");
        return this.console.nextLine();
    }
}

//типы
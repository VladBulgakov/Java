package Lab6.Task5;

public class NameInput extends AgeInput{
    public String name;
    @Override
    public void input(){
        System.out.println("Введите имя: ");
        this.name = getScanner().nextLine();
        //тут через гетер
    }
}
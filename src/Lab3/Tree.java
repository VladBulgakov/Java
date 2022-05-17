package Lab3;

public class Tree {
    public int age;
    public boolean isAlive;
    public String name;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Tree(int age, String name, boolean isAlive){
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }
}

package Lab3;

public class Main {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        Car car1 = new Car();
        car1.color = "Зеленый";
        car1.model = "Ford Focus";
        car1.weight = 1.665; //Вес в тоннах
        Car car2 = new Car("Синий", 1.956);
        car2.model = "Nissan Skyline";
        car1.printInfo();
        car2.printInfo();

        House house1 = new House();
        House house2 = new House();
        house1.setValues(5, 2001, "Дом на окраине города");
        house2.setValues(9, 1980, "Дом в центре города");
        house1.printValues();
        System.out.println("Лет с момента постройки: " + house1.getAge());
        house2.printValues();
        System.out.println("Лет с момента постройки: " + house2.getAge());

        Tree tree1 = new Tree();
        Tree tree2 = new Tree(30,"Сосна");
        Tree tree3 = new Tree(12, "Береза", true);
    }
}

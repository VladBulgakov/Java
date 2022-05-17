package Lab3;

import java.util.Calendar;

public class House {
    private int floorCount;
    private int buildYear;
    private String name;

    public void setValues(int floorCount, int buildYear, String name){
        this.floorCount = floorCount;
        this.buildYear = buildYear;
        this.name = name;
    }

    public void printValues(){
        System.out.println("Название дома: " + this.name + "; Год постройки: " + this.buildYear +
                "; Число этажей: " + this.floorCount);
    }

    public int getAge(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - this.buildYear;
    }
}

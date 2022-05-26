package Lab7.Task2;

public class Plane {
    public static class Wing{
        private double weight;

        public void setWeight(double weight){
            this.weight = weight;
        }

        public void showWeight(){
            System.out.println("Вес крыла: " + this.weight + " тонн");
        }
    }

    /*public void createWings(){
        Wing wingLeft = new Wing();
        wingLeft.setWeight(15.126);
        Wing wingRight = new Wing();
        wingRight.setWeight(15.245);
        wingLeft.showWeight();
        wingRight.showWeight();
    }*/
}

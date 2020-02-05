public class Cat {
   private String name;
   private int appetite;
   private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        isHungry=plate.decreaseFood(appetite);

    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }
}

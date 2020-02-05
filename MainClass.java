public class MainClass {
    public static void main(String[] args) {
         Plate plate = new Plate(80);
         Cat[] cats = new Cat[]{new Cat("Barsic",15), new Cat("Boris",20),
                 new Cat("Leo",30), new Cat("Murzik",25)};
                    for (Cat c:cats) {
                        System.out.println("\nКот "+c.getName());
                        System.out.println("Кот сытый? "+c.isHungry());
                        c.eat(plate);
                        plate.info();
                        System.out.println("Кот сытый? "+c.isHungry());
                    }
    }
}

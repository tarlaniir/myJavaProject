package school.lesson9;

public class Cat extends Animal {
    public static int catCount = 0;
    private final int MAX_RUN_DISTANCE = 200;



    private boolean satiety;

    public Cat(String name) {
        super(name);
        catCount++;
        satiety = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум " + MAX_RUN_DISTANCE + " м.)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }


    public void eat(Plate plate, int foodAmount) {
        if (plate.getFood() >= foodAmount) {
            plate.decreaseFood(foodAmount);
            satiety = true;
            System.out.println(name + " съел " + foodAmount + " ед. еды и теперь сыт.");
        } else {
            System.out.println(name + " не смог покушать, так как в тарелке недостаточно еды.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}

package school.lesson9;

public class Plate {
    private int food;

    public Plate(int food) {

        this.food = Math.max(food, 0);
    }

    public int getFood() {
        return food;
    }


    public void decreaseFood(int amount) {
        if (amount < 0) return;
        food = Math.max(food - amount, 0);
    }


    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public void printFood() {
        System.out.println("В тарелке " + food + " ед. еды.");
    }
}

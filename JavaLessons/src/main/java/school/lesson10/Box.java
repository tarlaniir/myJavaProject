package school.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }


    public void addFruit(T fruit) {
        if (fruit != null) {
            fruits.add(fruit);
        }
    }


    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }

        float weightPerFruit = fruits.get(0).getWeight();
        return weightPerFruit * fruits.size();
    }


    public boolean compare(Box<?> other) {
        return Math.abs(this.getWeight() - other.getWeight()) < 0.001f;
    }


    public void transferTo(Box<T> destination) {
        if (destination == null) {
            throw new IllegalArgumentException("Destination box cannot be null");
        }
        if (destination == this) {
            return; // Ничего не делаем, если это та же коробка
        }
        destination.fruits.addAll(this.fruits);
        this.fruits.clear();
    }


    public int getFruitCount() {
        return fruits.size();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                ", weight=" + getWeight() +
                '}';
    }
}

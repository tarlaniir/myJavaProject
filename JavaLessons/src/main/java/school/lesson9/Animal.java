package school.lesson9;

public abstract class Animal {
    protected String name;
    public static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }


    public abstract void run(int distance);
    public abstract void swim(int distance);

    public String getName() {
        return name;
    }
}

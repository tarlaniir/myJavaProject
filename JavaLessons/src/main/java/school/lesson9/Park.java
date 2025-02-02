package school.lesson9;

import java.util.ArrayList;

public class Park {
    private ArrayList<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }


    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name + ", Время работы: " + workingHours + ", Стоимость: " + cost;
        }
    }


    public void addAttraction(String name, String workingHours, double cost) {
        attractions.add(new Attraction(name, workingHours, cost));
    }

    public void printAttractions() {
        System.out.println("Аттракционы в парке:");
        for (Attraction a : attractions) {
            System.out.println(a);
        }
    }
}

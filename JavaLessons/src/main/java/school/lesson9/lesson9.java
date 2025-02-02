package school.lesson9;

public class lesson9 {
    public static void main(String[] args) {

        System.out.println("== Тестирование бега и плавания ==");
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Мурка");

        dog.run(400);
        dog.run(600);
        dog.swim(5);
        dog.swim(15);

        cat.run(150);
        cat.run(250);
        cat.swim(10);

        System.out.println("\nКоличество созданных животных: " + Animal.animalCount);
        System.out.println("Количество созданных собак: " + Dog.dogCount);
        System.out.println("Количество созданных котов: " + Cat.catCount);


        System.out.println("\n== Тестирование еды для котов ==");
        Plate plate = new Plate(50); // Тарелка с 50 единицами еды
        plate.printFood();


        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Мурзик");
        cats[2] = new Cat("Рыжик");


        for (Cat c : cats) {
            c.eat(plate, 20);
        }
        plate.printFood();


        plate.addFood(30);
        System.out.println("После добавления еды:");
        plate.printFood();


        for (Cat c : cats) {
            if (!c.isSatiety()) {
                c.eat(plate, 20);
            }
        }
        plate.printFood();


        for (Cat c : cats) {
            System.out.println(c.getName() + " сыт? " + (c.isSatiety() ? "Да" : "Нет"));
        }


        System.out.println("\n== Тестирование оплаты ==");
        Payment payment = new Payment();
        payment.addItem("Хлеб", 1.5, 2);
        payment.addItem("Молоко", 0.99, 3);
        payment.addItem("Яйца", 2.5, 1);
        payment.printReceipt();


        System.out.println("\n== Тестирование парка аттракционов ==");
        Park park = new Park();
        park.addAttraction("Колесо обозрения", "10:00-22:00", 5.0);
        park.addAttraction("Американские горки", "10:00-22:00", 7.5);
        park.addAttraction("Дом ужасов", "12:00-20:00", 4.0);
        park.printAttractions();
    }
}

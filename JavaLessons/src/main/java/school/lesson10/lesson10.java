package school.lesson10;

public class lesson10 {
    public static void main(String[] args) {

        String[] arr = {"first", "second", "third", "fourth"};
        System.out.println("Массив до swap:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();


        ArrayUtils.swap(arr, 1, 3);

        System.out.println("Массив после swap:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println("\n");


        Box<Apple> appleBox = new Box<>();
        Box<Apple> anotherAppleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();


        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());


        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());


        System.out.println("Коробки равны по весу? " + appleBox.compare(orangeBox));


        anotherAppleBox.addFruit(new Apple());

        System.out.println("\nДо пересыпания:");
        System.out.println("Яблочная коробка 1 содержит " + appleBox.getFruitCount() + " фрукт(ов)");
        System.out.println("Яблочная коробка 2 содержит " + anotherAppleBox.getFruitCount() + " фрукт(ов)");


        appleBox.transferTo(anotherAppleBox);

        System.out.println("\nПосле пересыпания:");
        System.out.println("Яблочная коробка 1 содержит " + appleBox.getFruitCount() + " фрукт(ов)");
        System.out.println("Яблочная коробка 2 содержит " + anotherAppleBox.getFruitCount() + " фрукт(ов)");
    }
}

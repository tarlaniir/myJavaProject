package school.lesson13;

import java.util.List;

public class lesson13 {
    public static void main(String[] args) {

        System.out.println("=== Анализ слов ===");
        String[] words = {
                "apple", "banana", "orange", "apple", "kiwi",
                "banana", "mango", "orange", "apple", "pear",
                "mango", "peach", "banana", "kiwi"
        };
        UniqueWordsTask.analyzeWords(words);


        System.out.println("\n=== Телефонный справочник ===");
        PhoneDirectory phoneDirectory = new PhoneDirectory();


        phoneDirectory.add("Иванов", "123-456-789");
        phoneDirectory.add("Петров", "987-654-321");
        phoneDirectory.add("Сидоров", "555-555-555");
        phoneDirectory.add("Иванов", "111-222-333"); // Еще один номер для Ивановых
        phoneDirectory.add("Смирнов", "444-444-444");
        phoneDirectory.add("Петров", "222-333-444"); // Еще один номер для Петровых


        printPhoneNumbers(phoneDirectory, "Иванов");
        printPhoneNumbers(phoneDirectory, "Петров");
        printPhoneNumbers(phoneDirectory, "Сидоров");
        printPhoneNumbers(phoneDirectory, "Неизвестный"); // Фамилия, которой нет в справочнике
    }


    private static void printPhoneNumbers(PhoneDirectory phoneDirectory, String surname) {
        List<String> numbers = phoneDirectory.get(surname);
        System.out.println("Телефоны для фамилии " + surname + ":");
        if (numbers.isEmpty()) {
            System.out.println("  Нет записей");
        } else {
            for (String number : numbers) {
                System.out.println("  " + number);
            }
        }
    }
}

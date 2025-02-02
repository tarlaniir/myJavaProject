package school.lesson8;

public class lesson8 {
    public static void main(String[] args) {

        Сотрудник[] persArray = new Сотрудник[5];

        persArray[0] = new Сотрудник("Иванов Иван", "Инженер", "ivanov@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Сотрудник("Петров Петр", "Менеджер", "petrov@mailbox.com", "892312313", 35000, 45);
        persArray[2] = new Сотрудник("Сидоров Сидор", "Программист", "sidorov@mailbox.com", "892312314", 40000, 50);
        persArray[3] = new Сотрудник("Кузнецов Кузьма", "Дизайнер", "kuznetsov@mailbox.com", "892312315", 32000, 28);
        persArray[4] = new Сотрудник("Смирнов Алексей", "Аналитик", "smirnov@mailbox.com", "892312316", 38000, 42);


        System.out.println("Информация обо всех сотрудниках:");
        for (Сотрудник сотрудник : persArray) {
            сотрудник.printInfo();
        }

        System.out.println("\nСотрудники старше 40 лет:");

        for (Сотрудник сотрудник : persArray) {
            if (сотрудник.getВозраст() > 40) {
                сотрудник.printInfo();
            }
        }
    }
}

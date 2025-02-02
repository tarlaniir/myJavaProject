package school.lesson8;

public class Сотрудник {

    private String ФИО;
    private String должность;
    private String email;
    private String телефон;
    private double зарплата;
    private int возраст;


    public Сотрудник(String ФИО, String должность, String email, String телефон, double зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }


    public void printInfo() {
        System.out.println("ФИО: " + ФИО +
                ", Должность: " + должность +
                ", Email: " + email +
                ", Телефон: " + телефон +
                ", Зарплата: " + зарплата +
                ", Возраст: " + возраст);
    }


    public int getВозраст() {
        return возраст;
    }


    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + ФИО + '\'' +
                ", должность='" + должность + '\'' +
                ", email='" + email + '\'' +
                ", телефон='" + телефон + '\'' +
                ", зарплата=" + зарплата +
                ", возраст=" + возраст +
                '}';
    }
}

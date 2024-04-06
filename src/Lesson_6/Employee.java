package Lesson_6;

public class Employee {
    private String surname;
    private String name;
    private String middle_name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String surname, String name, String middle_name, String position,
                    String email, int phone, int salary, int age){
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(surname + name + middle_name + position + email + phone + salary + age);
    }
}

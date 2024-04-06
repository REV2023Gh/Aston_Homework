package Lesson_6;

import java.util.Arrays;

//2
public class Main {
    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        personArray[1] = new Person ("Melnikov Alex", "Driver", "melnikovalex@mailbox.com", "89162223344", 45000, 45);
        personArray[2] = new Person("Safronov Dmitri", "Driver", "safronov@mailbox.com", "89162223345", 45000, 35);
        personArray[3] = new Person("Melnikov Dmitri", "Engineer QA", "melnikovdm@mailbox.com", "89164445566", 80000, 41);
        personArray[4] = new Person("Melnikov Alex", "Driver", "melnikovalex@mailbox.com", "89162223344", 45000, 45);
        System.out.println(Arrays.toString(personArray));
    }

    Park.Attractions.getInfo();
    Park.Attractions.getCost();
    Park.Attractions.getWorking_hours();

}

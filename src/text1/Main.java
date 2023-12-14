package text1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();


    }

    private static void task1() {
        System.out.println(" Задача 1 ");
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println(" Задача 2 ");
        System.out.println("Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

    }

    private static void task2() {
        System.out.println(" Задача 3 ");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        fullName = fullName.replace("ё",  "е");
        System.out.println("Ф.И.О. сотрудника - " + fullName);

    }
}


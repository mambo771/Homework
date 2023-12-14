package text1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


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
        fullName = fullName.replace("ё", "е");
        System.out.println("Ф.И.О. сотрудника - " + fullName);

    }

    private static void task3() {
        System.out.println(" Отработка");
        String phone = "980-639 82 86";
        phone= phone.replace("-",  "");
        phone = phone.replace(" ",  "");
        if (phone.length() == 10) {
           phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length()==11 && phone.charAt(0) !='7')
            throw new RuntimeException("Пендосовский номер");
        System.out.println("phone = " + phone);
        String expectedPhone= "79806398286";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

    }
}



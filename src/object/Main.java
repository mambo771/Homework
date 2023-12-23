package object;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1");
        checkVisYear(2000);
        checkVisYear(2023);
        checkVisYear(2025);
        System.out.println(" Задача 2");
        version(0, 2023);
        version(1, 2022);
        version(0,2018);
        System.out.println(" Задача 3");
        int deliveryDistance = 95;
        printDays(deliveryDistance);
        printDays(20);
        printDays(100);
        printDays(1100);



    }

    private static void checkVisYear(int year) {
        boolean vis = (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (vis) {
            System.out.println(year + " год високосный ");
        } else {
            System.out.println(year + " год невисокосный");

        }
    }

    private static void version(int mobileOS, int mobileYears) {
        if (mobileOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (mobileOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Некорректные данные");
        int currentYear = LocalDate.now().getYear();
        if (mobileYears != currentYear) {
            System.out.println("Для ОС" + mobileOS + "установите лайт версию");
        } else {
            System.out.println("Для ОС" + mobileOS + "установите обычную версию");
        }
    }
    private static void printDays(int delivery){
        int days = devileryDays(delivery);
    }
    private static int devileryDays (int delivery) {
        if (delivery <= 20) {
            System.out.println(" Доставка занимает сутки ");
        } else if (delivery > 20 && delivery < 60) {
            System.out.println(" Доставка занимает двое суток ");
        } else if (delivery > 60 && delivery <= 100) {
            System.out.println(" Доставка занимает трое суток ");
        } else {
            System.out.println(" Доставки нет ");
        }
        return delivery;
    }
}

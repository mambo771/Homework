package cycle2;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        System.out.println(" Задача 1");
        int ClientOS = 0;
        if (ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ClientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Некорректные данные");


    }

    private static void task2() {
        System.out.println(" Задача 2");
        int ClientOS = 0;
        int Year = 2023;
        if (ClientOS == 0 && Year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ClientOS == 0 && Year <= 2015) {
            System.out.println("Установите  облегченную версию приложения для iOS по ссылке");
        } else if (ClientOS == 1 && Year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (ClientOS == 1 && Year <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else
            System.out.println("Некорректные данные");

    }

    private static void task3() {
        System.out.println(" Задача 3");
        int year = 2023;
        boolean vis = (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (vis) {
            System.out.println(year + " год високосный ");
        } else {
            System.out.println(year + " год невисокосный");
        }
    }

    private static void task4() {
        System.out.println(" Задача 4");
        int Delivery = 80;
        if (Delivery <= 20) {
            System.out.println(" Доставка занимает сутки ");
        } else if (Delivery > 20 && Delivery < 60) {
            System.out.println(" Доставка занимает двое суток ");
        } else if (Delivery > 60 && Delivery < 100) {
            System.out.println(" Доставка занимает трое суток ");
        } else {
            System.out.println(" Доставки нет ");
        }
    }

    private static void task5() {
        System.out.println(" Задача 5");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println(" Зима ");
                break;
            case 3,4,5:
                System.out.println(" Весна ");
                break;
            case 6,7,8:
                System.out.println(" Лето ");
                break;
            case 9,10,11:
                System.out.println(" Осень");
                break;
        }

    }
}

package cycle4;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    private static void task1() {
        System.out.println(" Задача 1 ");
        int salary = 15_000;
        int total = 0;
        int i = 1;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = salary + total;
            System.out.println(" Месяц " + i + " - сумма накоплений = " + total + " рублей ");
            i++;
        }

    }

    private static void task2() {
        System.out.println(" Задача 2 ");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    private static void task3() {
        System.out.println(" Задача 3 ");
        int population = 12_000_000;
        int born = 17;
        int dead = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + population * 17 / 1000 - population * 8 / 1000;
            System.out.println(" Год " + i + " численность населения составляет " + population);
        }
    }

    private static void task4() {
        System.out.println(" Задача 4 ");
        int deposit = 15_000;
        double mouthPrecent = 0.07;
        int mouth = 1;
        while (deposit <= 12_000_000) {
            deposit += deposit * mouthPrecent;
            {

                System.out.println(" Месяц " + mouth + " сумма накопления равна " + deposit + " рублей");
            }
            mouth++;
        }
    }

    private static void task5() {
        System.out.println(" Задача 5 ");
        int deposit = 15_000;
        double mouthPrecent = 0.07;
        int mouth = 1;
        while (deposit <= 12_000_000) {
            deposit += deposit * mouthPrecent;
            if (mouth % 6 == 0) {
                System.out.println(" Месяц " + mouth + " сумма накопления равна " + deposit + " рублей");
            }
            mouth++;
        }
    }

    private static void task6() {
        System.out.println(" Задача 6 ");
        int deposit = 15_000;
        int years = 9;
        int mouthYears = years * 12;
        double mouthPrecent = 0.07;
        for (int mouth = 0; mouth <= mouthYears; mouth++) {
            deposit += deposit * mouthPrecent;
            if (mouth % 6 == 0) {
                System.out.println(" Месяц " + mouth + " сумма накопления равна " + deposit + " рублей");
            }
        }
    }

    private static void task7() {
        System.out.println(" Задача 7 ");
        int dayMouth = 31;
        for (int friday = 1; friday <= dayMouth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт");
        }

    }

    private static void task8() {
        System.out.println(" Задача 8 ");
        int ourYear = 2023;
        int startYear = ourYear - 200;
        int endYear = ourYear + 100;
        for (int year = startYear; year <= endYear; year ++)
        if (year % 79==0)
        {
            System.out.println(year);
        }
    }
}

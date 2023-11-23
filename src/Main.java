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
        System.out.println("Задача 1");
        byte Value1 = 3;
        short Value2 = 200;
        int Value3 = 1000;
        long Value4 = 1000000L;
        float Value5 = 1.98f;
        double Value6 = 333333.398d;
        System.out.println("Значение переменной Value1 с типом byte равно " + Value1);
        System.out.println("Значение переменной Value2 с типом short равно " + Value2);
        System.out.println("Значение переменной Value3 с типом int равно " + Value3);
        System.out.println("Значение переменной Value4 с типом long равно " + Value4);
        System.out.println("Значение переменной Value5 с типом float равно " + Value5);
        System.out.println("Значение переменной Value6 с типом double равно " + Value6);
    }

    private static void task2() {
        System.out.println("Задача 2");
        float number1 = 27.12f;
        long number2 = 987678965549L;
        float number3 = 2.786f;
        int number4 = 569;
        short number5 = -159;
        int number6 = 27897;
        byte number7 = 67;
        System.out.println("Значение переменной number1 с типом float равно " + number1);
        System.out.println("Значение переменной number2 с типом long равно " + number2);
        System.out.println("Значение переменной number3 с типом float равно " + number3);
        System.out.println("Значение переменной number4 с типом int равно " + number4);
        System.out.println("Значение переменной number5 с типом short равно " + number5);
        System.out.println("Значение переменной number6 с типом int равно " + number6);
        System.out.println("Значение переменной number7 с типом byte равно " + number7);
    }

    private static void task3() {
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        int paperbyclass = paper / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + paperbyclass + " листов бумаги. ");
    }

    private static void task4() {
        System.out.println("Задача 4");
        byte bootle = 16;
        byte time = 2;
        int perfomance = bootle / time;
        byte time1 = 20;
        System.out.println("За " + time1 + " минут машина произвела " + time1 * perfomance + " штук бутылок. ");
        int time2 = 24 * 60;
        System.out.println("За " + time2 + " минут машина произвела " + time2 * perfomance + " штук бутылок. ");
        int time3 = 3 * time2;
        System.out.println("За " + time3 + " минут машина произвела " + time3 * perfomance + " штук бутылок. ");
        int time4 = 30 * time2;
        System.out.println("За " + time4 + " минут машина произвела " + time4 * perfomance + " штук бутылок. ");
    }

    private static void task5() {
        System.out.println("Задача 5");
        byte cans = 120;
        byte whitecans = 2;
        byte browncans = 4;
        int clasess = cans / (whitecans + browncans);
        System.out.println("В школе, где " + clasess + " классов, нужно " + clasess * whitecans + " банок белой краски и " + clasess * browncans + " банок коричневой краски ");

    }

    private static void task6() {
        System.out.println("Задача 6 ");
        byte banana = 5;
        byte banana_gr = 80;
        int banana_total = banana * banana_gr;
        int milk = 2;
        byte milk_gr = 105;
        int milk_total = milk * milk_gr;
        byte ice = 2;
        byte ice_gr = 100;
        int ice_total = ice * ice_gr;
        byte eggs = 4;
        byte eggs_gr = 70;
        int eggs_total = eggs * eggs_gr;
        int weight1 = banana_total + milk_total + ice_total + eggs_total;
        float weight2 = weight1 / 1000f;
        System.out.println("Вес такого спортзавтрака " + weight1 + " грамм.");
        System.out.println("Вес такого спортзавтрака " + weight2 + " килограмм.");
    }

    private static void task7() {
        System.out.println("Задача 7 ");
        short diet_weight = 7000;
        short diet_day1 = 250;
        short diet_day2 = 500;
        int day1 = diet_weight / diet_day1;
        int day2 = diet_weight / diet_day2;
        int meddiumday  = (day1 + day2) / 2;
        System.out.println("Потребуется " + day1 + " дней, если скидывать по " + diet_day1 + " грамм в день ." );
        System.out.println("Потребуется " + day2 + " дней, если скидывать по " + diet_day2 + " грамм в день ." );
        System.out.println( "Потребуется " + meddiumday + " день в среднем, чтобы добиться результата похудения.");

    }
    private static void task8() {
        System.out.println("Задача 8 ");
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKris = 76_230;
        float bet = 1.1f;
        float newSalaryMasha = salaryMasha * bet;
        float newSalaryDenis = salaryDenis * bet;
        float newSalaryKris = salaryKris * bet;
        float differenceMasha = 12 * newSalaryMasha - 12 * salaryMasha;
        float differenceDenis = 12 * newSalaryDenis - 12 * salaryDenis;
        float differenceKris = 12 * newSalaryKris - 12 * salaryKris;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. " + " Годовой доход вырос на " + differenceMasha + " рублей." );
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. " + " Годовой доход вырос на " + differenceDenis + " рублей." );
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей. " + " Годовой доход вырос на " + differenceKris + " рублей." );

    }
}







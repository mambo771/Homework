package cycle1;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println(" Задача 1");
        int age = 17;
        if (age >= 18) {

            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не соверешеннолетний ");
        }
    }

    private static void task2() {
        System.out.println(" Задача 2");
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println(" На улице " + temperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + temperature + " градусов, можно идти без шапки ");
        }
    }

    private static void task3() {
        System.out.println(" Задача 3");
        int speed = 56;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно ");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то прийдется заплатить штраф ");
        }
    }

    private static void task4() {
        System.out.println(" Задача 4");
        int age = 22;
        if (age <= 1) {
            System.out.println("Если возраст человека равен " + age + " то находиться с мамой");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");

        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в на работу");
        }
    }

    private static void task5() {
        System.out.println(" Задача 5");
        int BabyAge = 9;
        boolean Parents = (BabyAge > 5 && BabyAge <= 14);
        if (BabyAge <= 5) {
            System.out.println("Если возраст ребенка равен " + BabyAge + " то ему нельзя кататься на аттракционе ");
        } else if (BabyAge > 5 && BabyAge <= 14 && Parents) {
            System.out.println("Если возраст ребенка равен " + BabyAge + " то ему можно кататься на аттракционе в сопровождении взрослого ");
        } else if (BabyAge > 5 && BabyAge <= 14) {
            System.out.println("Если возраст ребенка равен " + BabyAge + " то ему нельзя кататься на аттракционе без сопровождения взрослого ");
        } else {
            System.out.println("Если возраст ребенка равен " + BabyAge + " то он может кататься без сопровождения");
        }
    }

    private static void task6() {
        System.out.println(" Задача 6");
        int Total = 102;
        int Side = 60;
        int Stand = 42;
        int people = 30;
        boolean BuzySide = (people >= 60 && people <= Total);
        if (people < 60) {
            System.out.println(" В вагоне есть сидячих " + (Side - people) + " мест, а также " + (Total - Side) + " стоячих мест ");
        } else if (BuzySide) {
            System.out.println(" В вагоне нет сидячих мест, но есть " + (Total - people) + " стоячих мест ");
        } else {
            System.out.println(" В вагоне нет мест, ни стоячих ни сидячих, он переполнен на " + -(people - Total) + " человек ");
        }


    }

    private static void task7() {
        System.out.println(" Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean First = (one >two && one> three);
        boolean Second = (two > one && two > three);
        boolean Third = (three> two && three> one);
        if (First) {
            System.out.println(" Самым большим числом является " + one );
        }
        else if (Second) {
            System.out.println(" Самым большим числом является " + two );
        }
        else if  (Third){
            System.out.println(" Самым большим числом является " + three );
        }
    }
}



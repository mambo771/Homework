package massive1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        System.out.println(" Задача 1");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);
        float[] number = {1.57f, 7.654f, 9.986f};
        number[0] = 1.57f;
        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);
        }
        int[] weekDays = {1, 2, 3, 4, 5, 6, 7};
        weekDays[0] = 1;
        for (int i = 0; i < 7; i++) {
            System.out.println(weekDays[i]);
        }
    }

    private static void task2() {
        System.out.println(" Задача 2");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.print(weights[0] + " , ");
        System.out.print(weights[1] + " , ");
        System.out.print(weights[2]);
        System.out.println();
        float[] number = {1.57f, 7.654f, 9.986f};
        number[0] = 1.57f;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] weekDays = {1, 2, 3, 4, 5, 6, 7};
        weekDays[0] = 1;
        for (int i = 0; i < weekDays.length; i++) {
            System.out.print(weekDays[i]);
            if (i != weekDays.length - 1) {
                System.out.print(" , ");
            }
        }
    }

    private static void task3() {
        System.out.println();
        System.out.println(" Задача 3");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.print(weights[2] + " , ");
        System.out.print(weights[1] + " , ");
        System.out.print(weights[0]);
        System.out.println();
        float[] number = {1.57f, 7.654f, 9.986f};
        number[0] = 1.57f;
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] weekDays = {1, 2, 3, 4, 5, 6, 7};
        weekDays[0] = 1;
        for (int i = weekDays.length - 1; i >= 0; i--) {
            System.out.print(weekDays[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
    }

    private static void task4() {
        System.out.println();
        System.out.println(" Задача 4");
        int[] a = {1,2,3,4,5,6,7};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}




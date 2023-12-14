package Massive2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int[] arr = generateRandomArray();
        System.out.println(" Задача 1");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");
    }

    private static void task2() {
        int[] arr = generateRandomArray();
        System.out.println(" Задача 2");
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. Максимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей");
    }

    private static void task3() {
        int[] arr = generateRandomArray();
        System.out.println(" Задача 3");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (double i : arr) {
            sum += i;
        }
        double middleSum = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleSum + " рублей ");
    }

    private static void task4() {
        System.out.println(" Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
package memory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    private static void task1(){
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    private static void changeValue(int value) {
        value = 22;
    }
    private static void task2(){
        Integer value = 33;
        changeValueInteger(value);
        System.out.println(value);
    }

    private static void changeValueInteger(Integer value) {
        value=22;
    }
    private static void  task3(){
        Integer[] value = {3,4};
        changeValueArray(value);
        System.out.println(Arrays.toString(value));
    }

    private static void changeValueArray(Integer[] value) {
        value = new Integer[] {1,2};
    }
    private static void  task4(){
        Integer[] value = {3,4};
        changeValueArray2(value);
        System.out.println(Arrays.toString(value));
    }

    private static void changeValueArray2(Integer[] value) {
        value[0] = 99;
    }
    private static void  task5(){
        Person person = new Person ("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

    }

    private static void changePerson(Person person) {
         person = new Person ("Ilya", "Lagutenko");

    }
    private static void  task6(){
        Person person = new Person ("Lyapis", "Trubetskoy");
        changePerson2(person);
        System.out.println(person);

    }

    private static void changePerson2(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}

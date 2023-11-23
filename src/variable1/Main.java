package variable1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("Задача 4");
        var friend = 19.0;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача 6");
        var firstweight = 78.2;
        var secondweight = 82.7;
        var totalweight = firstweight + secondweight;
        System.out.println("Общий вес бойцов " + totalweight + " кг!");
        var differenceweight = secondweight - firstweight;
        System.out.println("Разница весов бойцов " + differenceweight + " кг!");
        System.out.println("Задача 7");
        var difference1var  = secondweight - firstweight;
        System.out.println("Разница первым способом " + difference1var + " кг!");
        var difference2var = secondweight % firstweight;
        System.out.println("Разница вторым способом " + difference2var + " кг!");
        System.out.println("Задача 8 ");
        var alltime = 640;
        var worktime = 8;
        var staff = alltime / worktime;
        System.out.println("Всего работников в компании " + staff + " чел.");
        var staffnew = staff + 94;
        var worktimenew = alltime / staffnew;
        System.out.println(" Если в комании работает " + staffnew + " чел."+ " то всего "+ worktimenew + " часа ");
    }

}
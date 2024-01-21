package oop1;

public class Main {
    public static void main(String[] args) {
        GriffindorStudent harryPotter = new GriffindorStudent(
                "Harry Potter",
                70,
                80,
                80,
                85,
                90
        );
        GriffindorStudent hermionGranger = new GriffindorStudent(
                "Hermion Grangerr",
                65,
                77,
                60,
                80,
                88
        );
        GriffindorStudent rohnUyzzly = new GriffindorStudent(
                "Rohn Uyzzly",
                67,
                76,
                83,
                86,
                66
        );
        SlizerinStudent drakoMalfoy = new SlizerinStudent(
                "Drako Malfoy",
                75,
                77,
                88,
                80,
                86,
                85,
                70

        );
        SlizerinStudent grachamMontegu = new SlizerinStudent(
                "Gracham Montegu",
                50,
                67,
                68,
                60,
                76,
                95,
                60

        );
        SlizerinStudent grageryGoil = new SlizerinStudent(
                "Gragery Goil",
                51,
                56,
                78,
                50,
                56,
                45,
                56

        );
        HufflepufStudent zahariyaSmith = new HufflepufStudent(
                "Zahariya Smith",
                45,
                48,
                68,
                70,
                46


        );
        HufflepufStudent sedrickDigary = new HufflepufStudent(
                "Sedrick Digary",
                80,
                78,
                68,
                68,
                66
        );
        HufflepufStudent djastinFinchFletchly = new HufflepufStudent(
                "Djastin Finch-Fletchly",
                57,
                46,
                63,
                84,
                33
        );
        RavenlawStudent chjouChang = new RavenlawStudent(
                "Chjou Chang",
                44,
                48,
                68,
                88,
                99,
                45
        );
        RavenlawStudent padmaPatil = new RavenlawStudent(
                "Padma Patil",
                65,
                84,
                86,
                65,
                73,
                82
        );
        RavenlawStudent marcusBelby = new RavenlawStudent(
                "Marcus Belby",
                87,
                31,
                61,
                74,
                91,
                53
        );
        System.out.println(harryPotter);
        System.out.println(hermionGranger);
        System.out.println(drakoMalfoy);
        System.out.println(grachamMontegu);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        System.out.println(sedrickDigary);
        System.out.println(djastinFinchFletchly);
        harryPotter.compare(hermionGranger);
        drakoMalfoy.compare(grachamMontegu);
        padmaPatil.compare(marcusBelby);
        sedrickDigary.compare(djastinFinchFletchly);
        harryPotter.compareAnyStudents(drakoMalfoy);
        hermionGranger.compareAnyStudents(grachamMontegu);
        padmaPatil.compareAnyStudents(marcusBelby);
        sedrickDigary.compareAnyStudents(djastinFinchFletchly);
    }
}

package ObjectandMethods;

public class Main {
    public static void main(String[] args) {
        Authors gogol = new Authors("Николай", "Гоголь");
        Authors tolstoy = new Authors("Лев", "Толстой");

        Book deadSouls = new Book("Мертвые души", gogol, 1842);
        Book deadSouls2 = new Book("Мертвые души", gogol, 1842);
        Book warAndPeace = new Book("Война и мир", tolstoy, 1865);
        System.out.println(deadSouls);
        System.out.println(warAndPeace);
        System.out.println(deadSouls.getTitleBook() + " " + deadSouls.getAuthors().getFirst()+ " " + deadSouls.getAuthors().getSecond() + " " + deadSouls.getYearPublisher() + " год " );

        deadSouls.setYearPublisher(1845);

        System.out.println(deadSouls.getTitleBook() + " " + deadSouls.getAuthors().getFirst()+ " " + deadSouls.getAuthors().getSecond() + " " + deadSouls.getYearPublisher() + " год " );

        System.out.println(warAndPeace.getTitleBook() + " " + warAndPeace.getAuthors().getFirst()+ " " + warAndPeace.getAuthors().getSecond() + " " + warAndPeace.getYearPublisher() + " год " );

        warAndPeace.setYearPublisher(1876);

        System.out.println(warAndPeace.getTitleBook() + " " + warAndPeace.getAuthors().getFirst()+ " " + warAndPeace.getAuthors().getSecond() + " " + warAndPeace.getYearPublisher() + " год " );
        System.out.println(deadSouls.equals(warAndPeace));
    }
}

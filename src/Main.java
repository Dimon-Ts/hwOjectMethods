public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание.Объекты и классы.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Небольшой библиотечный каталог.");
        System.out.println("==================================================================================");
        Book warAndPeace = new Book("War and Peace", 2021);
        Book warAndPeace2 = new Book("War and Peace", 2021);
        Author lev = new Author("Lev", "Tolstoy.");
        Author lev2 = new Author("Lev", "Tolstoy.");
        System.out.println(lev.equals(lev2));
        System.out.println(warAndPeace.hashCode());
        System.out.println(warAndPeace2.hashCode());
        warAndPeace.setYearPublication(2019);
        System.out.print(warAndPeace);
        System.out.print(lev);

        System.out.println();

        Book gardenOfCherry = new Book("Garden of Cherry", 1903);
        Author anton = new Author("Anton", "Chekhov.");
        Author anton2 = new Author("Anton", "Chekhov.");
        System.out.println(anton.equals(anton2));
        gardenOfCherry.setYearPublication(1910);
        System.out.print(gardenOfCherry);
        System.out.print(anton);

        System.out.println();

        Book amphibianMan = new Book("Amphibian Man", 1927);
        Author alexandr = new Author("Alexandr", "Belyaev.");
        Author alexandr2 = new Author("Alexandrs", "Belyaev.");
        System.out.println(alexandr.equals(alexandr2));
        amphibianMan.setYearPublication(1930);
        System.out.print(amphibianMan);
        System.out.print(alexandr);
    }

}
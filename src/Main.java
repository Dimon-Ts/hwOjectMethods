public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание.Объекты и классы.");
        System.out.println("Небольшой библиотечный каталог.");
        System.out.println("==================================================================================");
        Book warAndPeace = new Book("War and Peace", 2021);
        Book warAndPeace2 = new Book("War and Peace", 2021);
        Author lev = new Author("Lev", "Tolstoy.");
        Author lev2 = new Author("Lev", "Tolstoy.");
        System.out.println(warAndPeace.hashCode());
        System.out.println(warAndPeace2.hashCode());
        System.out.println(warAndPeace.equals(warAndPeace2));
        System.out.println();
        System.out.println(lev.hashCode());
        System.out.println(lev2.hashCode());
        System.out.println(lev.equals(lev2));
        warAndPeace.setYearPublication(2019);
        System.out.print(warAndPeace);
        System.out.print(lev);

        System.out.println();
        Book gardenOfCherry = new Book("Garden of Cherry", 1903);
        Book gardenOfCherry2 = new Book("Garden of Cherry", 1903);
        Author anton = new Author("Anton", "Chekhov.");
        Author anton2 = new Author("Anton", "Chekhov.");
        System.out.println(gardenOfCherry.hashCode());
        System.out.println(gardenOfCherry2.hashCode());
        System.out.println(gardenOfCherry.equals(gardenOfCherry2));
        System.out.println();
        System.out.println(anton.hashCode());
        System.out.println(anton2.hashCode());
        System.out.println(anton.equals(anton2));
        gardenOfCherry.setYearPublication(1910);
        System.out.print(gardenOfCherry);
        System.out.print(anton);

        System.out.println();
        Book amphibianMan = new Book("Amphibian Man", 1927);
        Book amphibianMan2 = new Book("Amphibian Man", 1927);
        Author alexandr = new Author("Alexandr", "Belyaev.");
        Author alexandr2 = new Author("Alexandrs", "Belyaev.");
        System.out.println(amphibianMan.hashCode());
        System.out.println(amphibianMan2.hashCode());
        System.out.println(amphibianMan.equals(amphibianMan2));
        System.out.println();
        System.out.println(alexandr.hashCode());
        System.out.println(alexandr2.hashCode());
        System.out.println(alexandr.equals(alexandr2));
        amphibianMan.setYearPublication(1930);
        System.out.print(amphibianMan);
        System.out.print(alexandr);
    }

}
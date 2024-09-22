public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Journey to the edge of the earth", "Maria Petrovna", 97812345, 15.99f);
        Book book2 = new Book("Secrets of Ancient Civilization", "Alexey Ivanov", 22);
        Book book3 = new Book();

        book1.getInfo();
        book2.getInfo();
        book3.getInfo();

        String result = book1.compareBooks(book2);
        System.out.println(result);
    }
}
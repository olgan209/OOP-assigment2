public class Book {
    private String title;
    private String author;
    private long isbn;
    private int price;

    public Book(String title, String author, long isbn, int price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getInfo(){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
    }
}

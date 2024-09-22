public class Book {
    private String title;
    private String author;
    private long isbn;
    private float price;

    public Book(){
        this.title = "";
        this.author = "";
        this.isbn = 0;
        this.price = 0.0f;
    }

    public Book(String title, String author, long isbn, float price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getInfo(){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public String compareBooks(Book otherBook){
        if(this.price > otherBook.price){
            return otherBook.title + " is cheaper then " + this.title;
        } else if(this.price < otherBook.price){
            return this.title + " is cheaper then " + otherBook.title;
        } else {
            return "The price is equal";
        }
    }
}

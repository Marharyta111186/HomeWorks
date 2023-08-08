package HomeWork16;

public class Book {

    int pages;
    int yearOfIssue;
    double price;
    String name;

    public Book(String name){
        this.name = name;
    }
    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public Book(String name,double price, int yearOfIssue){
        this.name = name;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
    }

    public Book(String name,double price, int yearOfIssue, int pages){
        this.name = name;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
        this.pages = pages;
    }

    public Book(){
    }

    void nameOfBook(){
    System.out.println("The name of the book is: ");
    }

    void yearOfBook (){
        System.out.println("Year of publication of this book is: ");
    }
    void priseBook(){
        System.out.println("The price of the book is: ");
    }

    void numberOfPages(){
        System.out.println("Number of pages in a book is: ");
    }

}

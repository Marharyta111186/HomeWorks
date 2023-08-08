package HomeWork16;

public class HomeWork_16 {

    public static void main(String[] args) {

        Student ivann = new Student();
        ivann.introduceYourself();
        System.out.println("===========================================");

        Student igor = new Student(21);
        igor.introduceYourself();
        System.out.println("I am " + igor.age + " years old!");

        System.out.println("===========================================");

        Student petr = new Student(20,3);
        petr.introduceYourself();
        System.out.println("I am " + petr.age + " years old!");
        System.out.println("I am a " + petr.course + " course student.");

        System.out.println("===========================================");

        Student vova = new Student(21,4,"Mathematics");
        vova.introduceYourself();
        System.out.println("I am " + vova.age + " years old!");
        vova.placeOfStudy();
        System.out.println("I am a " + vova.course + " course student.");
        System.out.println("I'm a student at the faculty of " + vova.faculty);

        System.out.println("==========================+++++++++++++++=================");

        Student sasha = new Student(22,5,"History", "conduct excursions");
        sasha.introduceYourself();
        System.out.println("I am " + sasha.age + " years old!");
        sasha.placeOfStudy();
        System.out.println("I am a " + sasha.course + " course student.");
        System.out.println("I'm a student at the faculty of " + sasha.faculty);
        System.out.println("with a great pleasure i will " +sasha.skills+ " for you!");
        sasha.bye();

        System.out.println("++++++++++++++++++++++++ BOOK ++++++++++++++++++++++++++++++");

        Book book = new Book("War and Peace");
        book.nameOfBook();
        System.out.println(book.name);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Book book1 = new Book("Pride and Prejudice", 22.50);
        book1.nameOfBook();
        System.out.println(book1.name);
        book1.priseBook();
        System.out.print(book1.price  + " euro!");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Book book2 = new Book("The Great Gatsby", 22.50, 1925);
        book2.nameOfBook();
        System.out.println(book2.name);
        book2.priseBook();
        System.out.println(book2.price  + " euro!");
        book2.yearOfBook();
        System.out.println(book2.yearOfIssue );

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Book book3 = new Book("Crime and Punishment", 22.50, 1925,528);
        book3.nameOfBook();
        System.out.println(book3.name);
        book3.priseBook();
        System.out.println(book3.price  + " euro!");
        book3.yearOfBook();
        System.out.println(book3.yearOfIssue );
        book3.numberOfPages();
        System.out.println(book3.pages);




    }
}

package HomeWork16;

public class HomeWork_16 {

    public static void main(String[] args) {

        Student Ivan = new Student();
        Ivan.introduceYourself();
        System.out.println("===========================================");

        Student Igor = new Student(21);
        Igor.introduceYourself();
        System.out.println("I am " + Igor.age + " years old!");

        System.out.println("===========================================");

        Student Petr = new Student(20,3);
        Petr.introduceYourself();
        System.out.println("I am " + Petr.age + " years old!");
        System.out.println("I am a " + Petr.course + " course student.");

        System.out.println("===========================================");

        Student Vova = new Student(21,4,"Mathematics");
        Vova.introduceYourself();
        System.out.println("I am " + Vova.age + " years old!");
        Vova.placeOfStudy();
        System.out.println("I am a " + Vova.course + " course student.");
        System.out.println("I'm a student at the faculty of " + Vova.faculty);

        System.out.println("===========================================");

        Student Sasha = new Student(22,5,"History", "conduct excursions");
        Sasha.introduceYourself();
        System.out.println("I am " + Sasha.age + " years old!");
        Sasha.placeOfStudy();
        System.out.println("I am a " + Sasha.course + " course student.");
        System.out.println("I'm a student at the faculty of " + Sasha.faculty);
        System.out.println("with a great pleasure i will " +Sasha.skills+ " for you!");
        Sasha.bye();
    }
}

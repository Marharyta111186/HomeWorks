package HomeWork16;

public class Student {

    int course;
    int age;
    String faculty;
    String skills;

    public Student (int age){
        this.age = age;
    }

    public Student (int age, int course){
        this.age = age;
        this.course = course;
    }

    public Student ( int age, int course, String faculty){
        this.age = age;
        this.course = course;
        this.faculty = faculty;
    }

    public Student ( int age, int course, String faculty, String skills){
        this.age = age;
        this.course = course;
        this.faculty = faculty;
        this.skills = skills;
    }

    public Student(){

    }



    void introduceYourself(){
        System.out.println("Hello, I am a student! ");
    }

    void placeOfStudy (){
        System.out.println("I study at University DNU. ");
    }

    void bye(){
        System.out.println("Thak's for your attention !");
    }



}

package Lesson_23;

import java.util.Arrays;

public class BusDriver {

    private String name;
    private String[] categories;
    private int age;

    private final int id;
    static private int counter;
    int cursor;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = counter++;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCategories() {
        return categories;
    }

    public void addCategories(String categories) {
        if (isArrayFull());{
            extractCategories();
        }
        this.categories[cursor+1]=categories;
        cursor++;
    }

    private boolean isArrayFull(){
        return cursor ==categories.length-1;
    }

    public void extractCategories() {
        categories=Arrays.copyOf(categories,categories.length+1);

    }

    public void removeCategories(String category) {//str.equals
        //TODO
    }

    @Override
    public String toString() {
        return "{id: " +id+"; name, "+name+"; category: "
                + Arrays.toString(categories)+" }";
    }

    //метод управления автобусом , ссылка на конткретный автос и водителя
    public void driveBus(Bus bus){
        System.out.println("Водитель "+ name + " id: "
                + id  + " управляет автобусом "+"id: "+ bus.getId());
    }
}

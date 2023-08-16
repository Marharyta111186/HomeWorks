package HW_22;

public class MainAll {
    public static void main(String[] args) {
        Animals animal = new Animals("Собака ","Barry");
        animal.setPet(true);
        System.out.println(animal.getSpecies()+" по имени "+animal.getName()+" домашнее животное ? ");
        System.out.println(animal.isPet());
        animal.eat();
        animal.sleep();

        System.out.println("================ Кот ========================");

        Cat cat = new Cat("Кошка ","Мурка");
        System.out.println(cat.toString()+" домашнее животное ? ");
        cat.setPet(true);
        System.out.println(cat.isPet());
        cat.eat();
        cat.sleep();
        cat.meow();

        System.out.println("================ Еда ========================");
       Food food = new Food("Яблоки");
       food.thisProduct();
        System.out.println(food.getCategory()+ " можно есть сырыми?");
       food.setEdible(true);
        System.out.println(food.isEdible());

        System.out.println("================ Картошка ========================");
        Vegetables vegetables = new Vegetables("Картошка");
        vegetables.thisProduct();
        System.out.println(vegetables.getCategory()+ " можно есть сырыми?");
        vegetables.setEdible(false);
        System.out.println(vegetables.isEdible());
        vegetables.getCalories(80);
        System.out.println(vegetables.toString());


    }
}

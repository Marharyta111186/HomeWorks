package HW_23;

public class HW_MainAll {
    public static void main(String[] args) {
        Animals23 animal = new Animals23("Собака ","Barry");
        animal.setPet(true);
        System.out.println(animal.getSpecies()+" по имени "+animal.getName()+" домашнее животное ? ");
        System.out.println(animal.isPet());
        animal.eat();
        animal.sleep();

        Owner owner=new Owner("София ","sofi@gmail.com");
        animal.setOwner(owner);
        System.out.println();
        Owner animalOwner=animal.getOwner();
        System.out.println("Хозяйка собаки: " +animalOwner.getName()+
                "контактная информация: "+animalOwner.getContactInfo());


        System.out.println("================ Кот ========================");

        Cat23 cat23 = new Cat23("Кошка ","Мурка");
        System.out.println(cat23.toString()+" домашнее животное ? ");
        cat23.setPet(true);
        System.out.println(cat23.isPet());
        cat23.eat();
        cat23.sleep();
        cat23.meow();

        Owner owner1 =new Owner("Маша ","mary@gmail.com");
        cat23.setOwner(owner);
        System.out.println();
        Owner catOwner=cat23.getOwner();
        System.out.println("Хозяйка кошки: " +catOwner.getName()+
                "контактная информация: "+catOwner.getContactInfo());

        System.out.println("================ Еда ========================");

        Food23 food23 = new Food23("Яблоки");
       food23.thisProduct();
        System.out.println(food23.getCategory()+ " можно есть сырыми?");
       food23.setEdible(true);
        System.out.println(food23.isEdible());
        ExpirationDate appleExpiration = new ExpirationDate("31.08.2023");
        food23.setExpirationDate(appleExpiration);
        food23.getExpirationDate().displayInfo();



        System.out.println("================ Картошка ========================");
        Vegetables23 vegetables23 = new Vegetables23("Картошка");
        vegetables23.thisProduct();
        System.out.println(vegetables23.getCategory()+ " можно есть сырыми?");
        vegetables23.setEdible(false);
        System.out.println(vegetables23.isEdible());
        vegetables23.setCalories(80);
        System.out.println(vegetables23.toString());
        ExpirationDate potatoExpiration = new ExpirationDate("15.09.2023");
        vegetables23.setExpirationDate(potatoExpiration);
        vegetables23.getExpirationDate().displayInfo();
        System.out.println("Вес продукта: "+ vegetables23.setWeight(2.50)+ " кг!");


    }
}

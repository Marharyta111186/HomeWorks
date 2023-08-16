package HW_22;

public class Cat extends Animals{


    public Cat(String species, String name) {
        super(species, name);
    }

    public void meow() {
        System.out.println("Я мяукаю ) ");
    }

    public String toString(){
        return "{ Животное : "+getSpecies()+" по имени "+getName()+ " }";
    }


}

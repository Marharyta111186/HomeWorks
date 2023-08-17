package HW_23;

public class Cat23 extends Animals23 {


    public Cat23(String species, String name) {
        super(species, name);
    }

    public void meow() {
        System.out.println("Я мяукаю ) ");
    }

    public String toString(){
        return "{ Животное : "+getSpecies()+" по имени "+getName()+ " }";
    }


}

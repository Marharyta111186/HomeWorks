package HW_23;

public class Animals23 {
    private String species;

    private String name;

    private boolean isPet;
    private Owner owner;

    public Animals23(String species, String name) {
        this.species=species;
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }

    public void eat() {
        System.out.println(species + " по имени " + name + " кушает!");
    }

    public void sleep() {
        System.out.println(species+ " по имени "+ name+   " спит!" );
    }

    public void isPet(boolean isPet) {
        isPet = isPet;
    }
}

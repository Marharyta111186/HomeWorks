package HW_23;

public class Vegetables23 extends Food23 {


    private int calories;
    private double weight;


    public Vegetables23(String category) {
        super(category);
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories(int calories) {
        return calories;
    }

    public double getWeight(double weight) {
        return weight;
    }

    public double setWeight(double weight) {
        this.weight = weight;
        return weight;
    }

    public String toString(){
        return "{ Продукт: " + getCategory()+" содержит "+ getCalories(calories) + " каллорий }";
    }


}

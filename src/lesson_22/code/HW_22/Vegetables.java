package HW_22;

public class Vegetables extends Food{


    private int calories;

    public Vegetables(String category) {
        super(category);
    }

    public int getCalories(int calories) {
        return calories;
    }

    public String toString(){
        return "{ Продукт: " + getCategory()+" содержит "+getCalories(80)+ " каллорий }";
    }


}

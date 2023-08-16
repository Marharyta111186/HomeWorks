package HW_22;

public class Food {

    private String category;

    private boolean isEdible;

    public Food(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }

    public void thisProduct(){
        System.out.println("Этот продукт " + category);
    }
}

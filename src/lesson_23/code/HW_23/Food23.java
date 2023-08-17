package HW_23;

public class Food23 {

    private String category;

    private boolean isEdible;

    private ExpirationDate expirationDate;


    public Food23(String category) {
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

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    public void thisProduct(){
        System.out.println("Этот продукт " + category);
    }
}

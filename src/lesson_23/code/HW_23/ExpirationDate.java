package HW_23;

public class ExpirationDate {
    private String date;

    public ExpirationDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void displayInfo() {
        System.out.println("Срок годности: " + date);
    }
}

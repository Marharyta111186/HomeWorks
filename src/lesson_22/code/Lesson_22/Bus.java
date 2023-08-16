package Lesson_22;

public class Bus extends Car {

    private int capacity;
    private int countPassenger;

    public Bus(String model, int yearOfManufacture, int capacity) {
        super(model, yearOfManufacture);
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    public void takePassenger(){
        System.out.println("Пассажир зашел в автобус");
        countPassenger++;
    }

    public void dropPassenger(){
        System.out.println("Пассажир вышел из автобуса");
        countPassenger--;
        if (countPassenger<0) countPassenger=0;
    }
}

package Lesson_22;

public class Car extends Vehicle{

    private  int mileage;
    public Car(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
    }

    public int getMileage(){
        return mileage;
    }

    public void goToRoute (int roteLength){
        System.out.println("Отправляюсь в поездку по маршруту!");
        gas();
        breaking();
        mileage+= roteLength;
    }

}



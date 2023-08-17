package Lesson_23;

public class Main_23 {
    public static void main(String[] args) {
        Bus bus = new Bus("Sprinter", 20);
        System.out.println(bus.toString());

        BusDriver driver = new BusDriver("Bob",35);
        System.out.println(driver.toString());


        BusDriver driver1= new BusDriver("John", 28);
        bus.setDriver(driver1);
        System.out.println(bus.toString());


        Bus bus1=new Bus("Vito",12,driver1);
        System.out.println(bus1.toString());
        //bus1.setDriver(driver);
        System.out.println(bus1.toString());

        bus.moveByDriver();
        bus1.moveByDriver();
        System.out.println("=================================");
        System.out.println(bus.getAutoPilot());
        bus.moveByAutopilot();
        bus.moveByAutopilot();
        bus.moveByDriver();




    }
}

package Lesson_23;

public class Bus {

    private int id;
    private String model;
    private int capacity;
    static private int counterForId;

    private BusDriver driver;

    private AutoPilotBus autoPilot;

    public Bus(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.autoPilot = new AutoPilotBus("AP-001",this);
        this.id =counterForId++;
    }
    public Bus (String model, int capacity,BusDriver driver){
        this(model,capacity);
        this.driver = driver;
    }

    public AutoPilotBus getAutoPilot() {
        return autoPilot;
    }

    public void moveByDriver(){//автобус начинает движение
        if (autoPilot.isActive()){
            autoPilot.turnOff();
        }
        driver.driveBus(this);//команда начать управление автобусом
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {//назначить водителя этого автобуса
        this.driver = driver;
    }

    public void moveByAutopilot(){
        autoPilot.driveBus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "{id: " + id+"; model: " +model+"; driver; "
                +(driver==null?" {no driver} " : driver.toString())+
                " автопилот: "+autoPilot.toString()+ " }";
    }



}

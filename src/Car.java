public abstract class Car extends Vehicle{
    private int wheels= 4;
    private String howGo="Earth";
    int speed= 0;
    String name= "Car";

    public void Car(){
        super.Vehicle();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }

    public String getHowGo() {
        return howGo;
    }
}

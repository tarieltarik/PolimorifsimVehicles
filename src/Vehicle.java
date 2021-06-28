public abstract class Vehicle {
    private String HowUsing = "Используется для предвижения";
    int wheels=0,speed=0;
    String name="Vehicle",howGo="Earth or Air";
    public void Vehicle(){
    }
    public int Vehicle(int time,int distance){
        speed = distance/time;
        return speed;
    }
    public String Vehicle(String str){
        return howGo = str;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }
}

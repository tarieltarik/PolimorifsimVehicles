public class Toyota extends Car{
    private String name= "Toyta",WhereMade="in Japan";
    private int wheels;
    private String howGo;
    String model = "car ";
    int speed= 0;
    Toyota(){
        super.Car();
        wheels = getWheels();
        howGo = getHowGo();
    }

    @Override
    public String getName() {
        return name;
    }

    public String getWhereMade() {
        return WhereMade;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

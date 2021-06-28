public class BMW extends Car {
    private String company= "BMW",WhereMade="in Germany";
    int wheels;
    String howGo;
    String model = "car ";
    int speed= 0;
    BMW(){
        super.Car();
        wheels = getWheels();
        howGo = getHowGo();
    }

    public String getCompany() {
        return company;
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

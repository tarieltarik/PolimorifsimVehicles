public class Main {
    public static void main(String[] args){
        BMW bmw = new BMW();
        bmw.setName("BMW");
        System.out.println("The car name: " + bmw.getName() + "\n"
                            + "How does it go: " + bmw.getHowGo() + "\n"
                            + "Wheels amount: " + bmw.getWheels() + "\n"
                            + "Speed value: " + bmw.getSpeed());


        Toyota toyota = new Toyota();
        bmw.setName("BMW");
        System.out.println("The car name: " + toyota.getName() + "\n"
                + "How does it go: " + toyota.getHowGo() + "\n"
                + "Wheels amount: " + toyota.getWheels() + "\n"
                + "Speed value: " + toyota.getSpeed());
    }
}

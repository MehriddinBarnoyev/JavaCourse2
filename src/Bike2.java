public class Bike2 extends Vehicle{
    public void run(){
        System.out.println("Bike2 running");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Bike2();
        bike2.run();





        Vehicle vehicle = new Bike2();
        vehicle.run();
    }
}

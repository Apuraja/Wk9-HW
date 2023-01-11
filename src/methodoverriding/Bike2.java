package methodoverriding;

class Bike2 extends Vehicle {
    //defining the same method as in the parent class
    public void run() {
        System.out.println("Bike is running safely");
    }
}

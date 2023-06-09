package Travels;

public class Passenger {
    
    public static void main(String args[]){

        Bus b = new Bus();
        Car c = new Car();

        Transport v = new Transport(b, c);
        v.Vehicle();
    }

}

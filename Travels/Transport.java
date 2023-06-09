package Travels;

class Transport{

    Bus b;
    Car c;

    Transport(Bus b, Car c){
        this.b = b;
        this.c = c;
    }

    void Vehicle(){
        b.start();
        c.start();
    }
}




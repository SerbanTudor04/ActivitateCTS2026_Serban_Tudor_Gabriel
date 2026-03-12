package ro.serbantudor04.seminar4;

import ro.serbantudor04.seminar4.hotel.Hotel;

public class Seminar4 {
    public static void main(String[] args) {

        Hotel hotel = Hotel.getInstance();
        Hotel hotel2 = Hotel.getInstance();

        hotel.afisareInchiriereCamera();
        hotel2.afisareDescriere();

    }
}

package ro.serbantudor04;

public class Medic {

    public boolean areInregistratPacientul(Pacient pacient){
        return pacient.getGravitate() > 5;
    }
}

package ro.serbantudor04;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        if(pacient.getGravitate() < 6){
            System.out.println("Pacientul nu are gravitate suficienta");
            return;

        }
        if(!medic.areInregistratPacientul(pacient)){
            System.out.println("Pacientul nu este inregistrat in sistem");
            return;

        }
        int patLiber = salon.getPatLiber();
        if(patLiber==-1){
            System.out.println("Nu exista paturi libere");
            return;
        }
        System.out.println("Patul este liber");
        salon.ocupaPat(patLiber);
    }

}

import ro.serbantudor04.Medic;
import ro.serbantudor04.Pacient;
import ro.serbantudor04.ReceptieSpital;
import ro.serbantudor04.Salon;

void main(){

    Medic med = new Medic();
    Salon salon = new Salon();

    Pacient ion  = new Pacient("ion", 10);
    Pacient mihai = new Pacient("mihai", 2);
    Pacient tudor = new Pacient("tudor", 6);

    ReceptieSpital receptie = new ReceptieSpital(med, salon);

    receptie.interneazaPacient(ion);
    receptie.interneazaPacient(mihai);
    receptie.interneazaPacient(tudor);



}
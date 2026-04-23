import ro.serbantudor04.adapterpattern.farmacie.Medicament;
import ro.serbantudor04.adapterpattern.spital.MedicamentAdapter;



void procuraMedicament(Medicament medicament){
    medicament.cumparaMedicament();
}

void main(){

    Medicament medicamentFarmacie =  new Medicament("Paracetamol");
    ro.serbantudor04.adapterpattern.spital.Medicament medicamentSpital = new ro.serbantudor04.adapterpattern.spital.Medicament("Paracetamol Reteta", 100);
    medicamentFarmacie.cumparaMedicament();
    medicamentSpital.achizitioneazaMedicament();


    MedicamentAdapter adaptor =  new MedicamentAdapter(medicamentSpital);

    procuraMedicament(medicamentFarmacie);
    procuraMedicament(adaptor);



}

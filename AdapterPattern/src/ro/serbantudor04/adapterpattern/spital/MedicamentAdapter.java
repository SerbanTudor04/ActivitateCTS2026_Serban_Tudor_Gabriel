package ro.serbantudor04.adapterpattern.spital;

import ro.serbantudor04.adapterpattern.farmacie.Medicament;

public class MedicamentAdapter extends Medicament {

    ro.serbantudor04.adapterpattern.spital.Medicament medicamentSpital;

    public MedicamentAdapter(ro.serbantudor04.adapterpattern.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;

    }


    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }

}

package ro.serbantudor04.decorator.decorators;

import ro.serbantudor04.decorator.model.NotaDePlataInterface;

public abstract class NotaDePlataDecorator implements NotaDePlataInterface {
    protected NotaDePlataInterface notaDePlata;

    public NotaDePlataDecorator(NotaDePlataInterface notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }


    public abstract void printeazaFelicitare();




}

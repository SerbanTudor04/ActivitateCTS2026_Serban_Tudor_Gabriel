package ro.serbantudor04.decorator;

import ro.serbantudor04.decorator.decorators.NotaDePlataDecorator;
import ro.serbantudor04.decorator.model.NotaDePlataInterface;

public class NotaDePlataAnNou extends NotaDePlataDecorator {
    public NotaDePlataAnNou(NotaDePlataInterface notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitari pentru anul nou!");
        notaDePlata.printeaza();
    }
}

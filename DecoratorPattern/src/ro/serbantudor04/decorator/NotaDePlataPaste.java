package ro.serbantudor04.decorator;

import ro.serbantudor04.decorator.decorators.NotaDePlataDecorator;
import ro.serbantudor04.decorator.model.NotaDePlataInterface;

public class NotaDePlataPaste extends NotaDePlataDecorator {

    public NotaDePlataPaste(NotaDePlataInterface notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitari pentru pastele!");
        notaDePlata.printeaza();
    }
}

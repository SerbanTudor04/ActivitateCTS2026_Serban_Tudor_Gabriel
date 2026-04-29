package ro.serbantudor04.decorator;

import ro.serbantudor04.decorator.model.NotaDePlata;

public class DecoratorProgram {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(100, "2023-01-01");
        notaDePlata.printeaza();

        NotaDePlataAnNou notaDePlataAnNou = new NotaDePlataAnNou(notaDePlata);
        notaDePlataAnNou.printeazaFelicitare();

        NotaDePlataPaste notaDePlataPaste = new NotaDePlataPaste(notaDePlataAnNou);
        notaDePlataPaste.printeazaFelicitare();

    }
}

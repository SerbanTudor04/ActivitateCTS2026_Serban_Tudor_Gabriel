package ro.serbantudor04.decorator.model;

public class NotaDePlata implements NotaDePlataInterface{
    private double suma;
    private String data;

    public NotaDePlata(double suma, String data) {
        this.suma = suma;
        this.data = data;
    }


    @Override
    public void printeaza() {
        System.out.println("Suma: " + suma + " Data: " + data);
    }
}

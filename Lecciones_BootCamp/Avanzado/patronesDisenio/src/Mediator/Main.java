package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediadorContreto();
        Colega colega1 = new ColegaContreto1();
        Colega colega2 = new ColegaConcreto2();
        Colega colega3 = new ColegaConcreto3();

        mediator.registra(colega1);
        mediator.registra(colega2);
        mediator.registra(colega3);


        colega1.envia();
        colega2.envia();



    }
}

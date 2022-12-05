package Mediator;

public class ColegaConcreto2 extends Colega{

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto2");
    }

    @Override
    void envia() {
        System.out.println("Soy colegaConcreto2, envia un mensaje");
        mediator.reenvia(this);
    }
}
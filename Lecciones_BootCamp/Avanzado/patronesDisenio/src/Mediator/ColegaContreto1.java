package Mediator;

public class ColegaContreto1 extends Colega{

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto1");
    }

    @Override
    void envia() {
        System.out.println("Soy colegaConcreto1, envia un mensaje");
        mediator.reenvia(this);
    }
}

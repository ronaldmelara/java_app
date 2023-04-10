package State;

import Decorator.Telefono;

abstract public class Estado {
    public TelefonoMovil telefono;

    public Estado(TelefonoMovil telefono) {
        this.telefono = telefono;
    }

    abstract public String desbloquear();
    abstract public String abrirCamara();
    abstract public String hacerFoto();

}

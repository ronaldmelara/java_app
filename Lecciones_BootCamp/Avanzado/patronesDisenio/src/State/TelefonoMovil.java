package State;

public class TelefonoMovil {

    public Estado estado;
    public TelefonoMovil(){
        estado = new EstadoBloqueado(this);
    }

    public void cambiarEstado(Estado estado){
        System.out.println("estado inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("estado final: " + this.estado.getClass().getName());
    }

    public Estado getEstado(){

        return estado;
    }
}

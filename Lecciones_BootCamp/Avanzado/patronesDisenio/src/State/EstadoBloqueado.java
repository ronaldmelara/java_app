package State;

public class EstadoBloqueado extends Estado{

    public EstadoBloqueado(TelefonoMovil telefonoMovil){

        super(telefonoMovil);
    }
    @Override
    public String desbloquear() {

        telefono.cambiarEstado(new EstadoDesbloqueado(telefono));
        return "Movil desbloqueado, procede....";
    }

    @Override
    public String abrirCamara() {

        return "abrirCamara(): La camara esta bloqueada. Debloquea el movil antes";
    }

    @Override
    public String hacerFoto() {

        return "hacerFoto(): La camara esta bloqueada. Debloquea el movil antes";
    }

}

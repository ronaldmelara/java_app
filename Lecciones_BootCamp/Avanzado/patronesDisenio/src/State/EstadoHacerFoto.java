package State;

public class EstadoHacerFoto extends Estado{

    public EstadoHacerFoto(TelefonoMovil telefonoMovil){
        super(telefonoMovil);
    }
    @Override
    public String desbloquear() {

        return "Movil ya desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "La camara ya la habias abierto.";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiarEstado(new EstadoBloqueado(telefono));
        return "La foto se ha hecho!!!";
    }
}

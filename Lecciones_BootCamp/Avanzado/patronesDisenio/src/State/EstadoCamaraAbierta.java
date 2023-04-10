package State;

public class EstadoCamaraAbierta extends Estado{

    public EstadoCamaraAbierta(TelefonoMovil telefonoMovil){
        super(telefonoMovil);
    }
    @Override
    public String desbloquear() {
        return "YA ESTABA DESBLOQUEADO EL MOVIL!!";
    }

    @Override
    public String abrirCamara() {
        return "LA CAMARA YA LA HABIAS ABIERTO!!!";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiarEstado(new EstadoHacerFoto(telefono));

        return "LA FOTO SE VA A DISPARAR YA!!!";
    }
}

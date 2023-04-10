package State;

public class EstadoDesbloqueado extends Estado{

    public EstadoDesbloqueado(TelefonoMovil telefonoMovil){

        super(telefonoMovil);
    }
    @Override
    public String desbloquear() {
        return "desbloquear(): El movil ya estaba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiarEstado(new EstadoCamaraAbierta(telefono));
        return "Camara abierta, puedes hacer la foto";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): No se puede hacer una foto sin abrir la camara";
    }
}

package Iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private int position = 0;

    public void crear(Usuario usuario){

        usuarios.add(usuario);
    }

    @Override
    public boolean hasMore() {

        return position < usuarios.size();
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Usuario next() {
        Usuario usuario = usuarios.get(position);
        position = position + 1;
        return usuario;
    }
}

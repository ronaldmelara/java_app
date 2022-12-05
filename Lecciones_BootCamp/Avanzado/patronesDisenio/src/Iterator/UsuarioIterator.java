package Iterator;

public interface UsuarioIterator {
    boolean hasMore();
    void reset();

    Usuario next();
}

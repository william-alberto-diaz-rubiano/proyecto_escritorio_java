
package DAOS_JDBC;

import java.util.List;

public interface DAO<T,K> {
    void crear(T a);
    void modificar(T a);
    void eliminar(K Correo_institucional);
    List<T> obtenerTodos();
    T obtener(K Correo_institucional);
}

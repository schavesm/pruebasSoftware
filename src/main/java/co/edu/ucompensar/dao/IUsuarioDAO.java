package co.edu.ucompensar.dao;

import co.edu.ucompensar.modelo.Usuario;

public interface IUsuarioDAO {

    void guardar(Usuario usuario);
    boolean existeDocumento(String documento);
}

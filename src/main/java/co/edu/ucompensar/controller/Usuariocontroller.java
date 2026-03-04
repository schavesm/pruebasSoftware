package co.edu.ucompensar.controller;

import co.edu.ucompensar.dao.UsuarioDAOImpl;
import co.edu.ucompensar.modelo.Usuario;

public class Usuariocontroller {

    private UsuarioDAOImpl usuarioDAOImpl;

    public String guardar(Usuario usuario) {
        usuarioDAOImpl = new UsuarioDAOImpl();
        usuarioDAOImpl.guardar(usuario);
        return "Registro exitoso";
    }
}

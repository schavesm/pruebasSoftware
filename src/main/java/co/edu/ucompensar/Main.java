package co.edu.ucompensar;


import co.edu.ucompensar.controller.Usuariocontroller;
import co.edu.ucompensar.dao.IUsuarioDAO;
import co.edu.ucompensar.dao.UsuarioDAOImpl;
import co.edu.ucompensar.modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        IUsuarioDAO usuarioDAO = new UsuarioDAOImpl();
        Usuariocontroller usuariocontroller = new Usuariocontroller();

        Usuario usuario = new Usuario();
        usuario.setDocumento("123");
        usuario.setNombre("SANTIAGO");
        usuario.setApellido("chaves");
        usuario.setEmail("santiago@gmail.com");
        usuario.setPassword("123456");

        usuariocontroller.guardar(usuario);

        }
    }

package co.edu.ucompensar.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    private Usuario usuario = new Usuario();

    @BeforeEach
    public void setUp(){


    }

    @Test
    public void testAsignarDato(){
        usuario.setDocumento("1233494563");
        usuario.setNombre("Santiago");
        usuario.setApellido("Chaves");
        usuario.setEmail("schaves@ucompensar.edu.co");
        usuario.setPassword("123456");

        assertEquals("1233494563",usuario.getDocumento());
        assertEquals("Santiago",usuario.getNombre());
        assertEquals("Chaves",usuario.getApellido());
        assertEquals("schaves@ucompensar.edu.co",usuario.getEmail());
        assertEquals("123456",usuario.getPassword());

    }
}

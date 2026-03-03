package co.edu.ucompensar.controller;

import co.edu.ucompensar.dao.UsuarioDAOImpl;
import co.edu.ucompensar.modelo.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import co.edu.ucompensar.dao.IUsuarioDAO;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class UsuariocontrollerTest {


    @Mock
    private IUsuarioDAO iUsuariodao;

    @InjectMocks
    private UsuarioDAOImpl usuarioDAOImpl;

    private Usuario usuario;
    private Usuariocontroller usuariocontroller;




    @Test
    public void testRegistrarConDatosvalidos(){
        usuario.setDocumento("1233494563");
        usuario.setNombre("santiago");
        usuario.setApellido("chavez");
        usuario.setEmail("santiago@gmail.com");
        usuario.setPassword("123456");
        String resultado = usuariocontroller.guardar(usuario);

        assertEquals("registro exitoso", resultado);

    }
    @Test
    public void testDocumentoExiste(){

        Mockito.when(iUsuariodao.existeDocumento("123456")).thenReturn(true);

    }

}
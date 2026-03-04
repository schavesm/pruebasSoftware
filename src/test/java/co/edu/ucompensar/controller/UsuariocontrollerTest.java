package co.edu.ucompensar.controller;

import co.edu.ucompensar.dao.UsuarioDAOImpl;
import co.edu.ucompensar.modelo.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import co.edu.ucompensar.dao.IUsuarioDAO;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UsuariocontrollerTest {


    @Mock
    private IUsuarioDAO iUsuariodao;

    @InjectMocks
    private Usuariocontroller usuariocontroller;

    private Usuario usuario;





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

        boolean resultado = iUsuariodao.existeDocumento("123456");

        assertTrue(true, String.valueOf(resultado));

        Mockito.verify(iUsuariodao).existeDocumento("123456");

    }

}
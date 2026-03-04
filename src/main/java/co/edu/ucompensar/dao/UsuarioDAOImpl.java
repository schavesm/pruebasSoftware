package co.edu.ucompensar.dao;

import co.edu.ucompensar.modelo.Usuario;
import co.edu.ucompensar.util.Conexion;

public class UsuarioDAOImpl implements IUsuarioDAO {


    @Override
    public void guardar(Usuario usuario) {
        String sql = "INSERT INTO usuarios VALUES(?,?,?,?,?)";
        try(var connection = Conexion.getConnection();
            var statement = connection.prepareStatement(sql)){
            statement.setString(1, usuario.getDocumento());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getApellido());
            statement.setString(4, usuario.getEmail());
            statement.setString(5, usuario.getPassword());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean existeDocumento(String documento) {
        return false;
    }
}

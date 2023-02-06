package usuarios;

import usuarios.Usuario;

public class UsuarioParticular extends Usuario {
    public UsuarioParticular(String nombre, String apellido, String cedula, String email){
        super(nombre, apellido, cedula, email);
    }
    @Override
    public String obtenerTipo(){return"Particular";}
}

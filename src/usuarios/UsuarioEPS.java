package usuarios;

import usuarios.Usuario;

public class UsuarioEPS extends Usuario {

    public UsuarioEPS(String nombre, String apellido, String cedula, String email){
        super(nombre, apellido, cedula, email);
    }
    @Override
    public String obtenerTipo(){return"EPS";}
}

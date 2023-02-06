package usuarios;

import usuarios.Usuario;

public class UsuarioPoliza extends Usuario {
    public UsuarioPoliza(String nombre, String apellido, String cedula, String email){
        super(nombre, apellido, cedula, email);
    }
    @Override
    public String obtenerTipo(){return"Poliza";}
}

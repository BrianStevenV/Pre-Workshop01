package usuarios;

public  abstract class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;

    public Usuario(String nombre, String apellido, String cedula, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public String getCedula() {
        return cedula;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String obtenerTipo(){return"";};
}

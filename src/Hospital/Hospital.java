package Hospital;

import especialidades.Especialidades;
import usuarios.Usuario;

public class Hospital {
    private Usuario usuario;
    private Especialidades  especialidad;
    private String fecha_cita;
    private double valor_pagar;


    public Hospital(Usuario usuario, Especialidades especialidad, String fecha_cita, double valor_pagar_base) {
        this.usuario = usuario;
        this.especialidad = especialidad;
        this.fecha_cita = fecha_cita;
        this.valor_pagar = valor_pagar_base;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

//    public void setFecha_cita(String fecha_cita) {
//        this.fecha_cita = fecha_cita;
//    }
//
//    public double getValor_pagar() {
//        return valor_pagar;
//    }
//
//    public void setValor_pagar(double valor_pagar) {
//        this.valor_pagar = valor_pagar;
//    }

    public double calcular_pagar(Usuario usuario){
        if(this.usuario.obtenerTipo() == "Particular"){
            valor_pagar += 30000;
        } else if (this.usuario.obtenerTipo() == "Poliza"){
            valor_pagar += 40000;
        } else if (this.usuario.obtenerTipo() == "EPS") {
            valor_pagar += 70000;
        } else {
            System.out.println("Error");
        }
        return valor_pagar;
    }

    public String agendar_cita(){
        String mensaje = "El usuario " + this.usuario.getCedula() + " con nombre " + this.usuario.getNombre() + " tiene la cita agendada para el: " + this.getFecha_cita() + " con un valor a pagar de: " + this.valor_pagar;
        return mensaje;
    }
}

import Hospital.Hospital;
import especialidades.Especialidades;
import usuarios.UsuarioEPS;
import usuarios.UsuarioParticular;
import usuarios.UsuarioPoliza;

public class Main {
    public static void main(String[] args) {

        UsuarioEPS eps = new UsuarioEPS("Viviana", "Soto", "34351238", "viviana@mail.com");
        UsuarioParticular particular = new UsuarioParticular("Luis", "Remolina", "2353465", "luis@mail.com");
        UsuarioPoliza poliza = new UsuarioPoliza("Brian", "Steven", "10341364", "brian@mail.com");

        Especialidades espEps = new Especialidades("Cardiologia", "123", "EPS");
        Especialidades espParticular = new Especialidades("Inyectologia", "456", "Particular");
        Especialidades espPoliza = new Especialidades("Ortopedia", "789", "Poliza");

        Hospital hospitalEPS = new Hospital(eps,espEps,"10/02/2023",100);
        Hospital hospitalParticular =new Hospital(particular, espParticular, "06/02/2023", 50);
        Hospital hospitalPoliza = new Hospital(poliza, espPoliza, "09/08/2021", 600);

        hospitalEPS.calcular_pagar(eps);
        hospitalParticular.calcular_pagar(particular);
        hospitalPoliza.calcular_pagar(poliza);

        System.out.println(hospitalEPS.agendar_cita());
        System.out.println(hospitalParticular.agendar_cita());
        System.out.println(hospitalPoliza.agendar_cita());
    }
}
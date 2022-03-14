import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        Persona portero = new Empleado(123, "Juan", "10/10/2000", TipoEmpleado.PORTERO);
        Persona persona = new Persona(456, "Ana", "08/08/1990");

        Animal leon = new Leon("Mufassa");
        leon.modoAlimentacion();

        Animal oso = new Oso("Balu");
        oso.modoAlimentacion();

        Servicio boleteria = new ServicioBoleteria();
        boleteria.realizarServicioDeVenta();

        List lista = new ListaAnimales();
        System.out.println(lista.size());
    }
}

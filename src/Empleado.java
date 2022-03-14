public class Empleado extends Persona {

    private int identificador;
    public TipoEmpleado cargo;

    public Empleado(int carnetDeIdentidad, String nombre, String fechaDeNacimiento, TipoEmpleado cargo) {
        super(carnetDeIdentidad, nombre, fechaDeNacimiento);
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificador=" + identificador +
                ", cargo=" + cargo +
                ", telefono=" + telefono + " - " + getCarnetDeIdentidad() +
                '}';
    }
}

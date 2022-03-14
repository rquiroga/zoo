abstract public class Animal {

    private String codigo;
    protected String raza;
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    abstract public void modoAlimentacion();
    abstract void cuidados();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

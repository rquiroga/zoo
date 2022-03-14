public class Leon extends Animal {

    public Leon(String nombre) {
        super(nombre);
    }

    @Override
    public void modoAlimentacion() {
        System.out.println("alimentar con carne de res");
    }

    @Override
    void cuidados() {

    }
}

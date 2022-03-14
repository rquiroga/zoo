public class Oso extends Animal {

    public Oso(String nombre) {
        super(nombre);
    }

    @Override
    public void modoAlimentacion() {
        System.out.println("alimentar con salmon");
        System.out.println("vitaminas");
    }

    @Override
    void cuidados() {

    }


}

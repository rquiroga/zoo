public enum TipoEmpleado {

    PORTERO("Portero", 1),
    JARDINERO("Jardinero", 2),
    CUIDADOR_DE_ANIMALES("", 3);

    private final String cargo;

    private TipoEmpleado(String cargo, int id) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "TipoEmpleado{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}

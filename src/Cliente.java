public class Cliente extends Persona {

    private String correoElectronico;

    public Cliente(int carnetDeIdentidad, String nombre, String fechaDeNacimiento){
        super(carnetDeIdentidad, nombre, fechaDeNacimiento);
    }

    public Cliente(int carnetDeIdentidad, String nombre, String fechaDeNacimiento, String correoElectronico){
        super(carnetDeIdentidad, nombre, fechaDeNacimiento);
        this.setCorreoElectronico(correoElectronico);
    }


    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if(!correoElectronico.equals("")) {
            this.correoElectronico = correoElectronico;
        }
    }
}

package factory;

public class ProductoCaducable extends Producto{
    private int diasCaducidad;

    public ProductoCaducable() {
    }

    public ProductoCaducable(int codigo, String nombre) {
        super(codigo, nombre);
    }

    public ProductoCaducable(int diasCaducidad, int codigo, String nombre) {
        this(codigo, nombre);
        this.setDiasCaducidad(diasCaducidad);
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }
}//fin class ProductoCaducable

package factory;

public class ProductoNoCaducable extends  Producto{
    public ProductoNoCaducable(){
        this(0, "");
    }

    public ProductoNoCaducable(int codigo, String nombre) {
        super(codigo, nombre);
    }
}//fin class ProductoNoCaducable

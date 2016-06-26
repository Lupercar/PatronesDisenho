package factory;

import factory.interfaces.ProductoCreable;

public abstract class Producto implements ProductoCreable {
    private int codigo;
    private String nombre; 

    public Producto() {
        this(0, ""); 
    }

    public Producto(int codigo, String nombre) {
        super();
        this.setCodigo(codigo);
        this.setNombre(nombre);
    }
    
    

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}//fin class Producto

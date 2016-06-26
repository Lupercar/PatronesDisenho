package factory;

import factory.interfaces.ProductoCreable;

/*
     El patrón factory se usa para crear objetos o instancias en memoria.
    A veces tenemos varias clases hijo de un padre. Con el Factory con un
    parámetro podemos elegir el objeto de la clase hijo que queremos que 
    nos cree y devuelva. 

    1.- Crear una interfaz que va  a implementar las clases que se van
    a ver afectadas por el patrón factory, en esta interfaz definiremos
    la funcionalidad común, entre la clase padre y las hijas. 

    2.- Crear una clase factoria donde tenemos un método con un parámetro
    para saber que tipo de objeto tiene que crear, lo crea y le hace 
    un casting a la interfaz. 
 */
public class ProductoFactory {

    public enum TipoProducto {
        PRODUCTO_CADUCABLE, PRODUCTO_NO_CADUCABLE
    };

    public ProductoCreable newInstance(int codigo, String nombre,
            TipoProducto tipoProducto) {

        ProductoCreable producto = null;

        switch (tipoProducto) {
            case PRODUCTO_CADUCABLE:
                producto = new ProductoCaducable(codigo, nombre); 
                break;
            case PRODUCTO_NO_CADUCABLE:
                producto = new ProductoNoCaducable(codigo, nombre); 
                break;
        }
        return producto; 
    }
}//fin class ProductoFactory

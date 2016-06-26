package consola;

import Observable.EmisorEvento;
import Observable.Oyente;
import factory.Producto;
import factory.ProductoCaducable;
import factory.ProductoFactory;
import factory.interfaces.ProductoCreable;

public class App {

    public static void main(String[] args) {
        // TODO code application logic here
//       Ejemplo patrón Observe
//        EmisorEvento e = new EmisorEvento();
//        Oyente o = new Oyente();
//        
//        e.addEmisorOyenteListener(o);
//        e.setValor(100);

//        Ejemplo patrón factory
        ProductoFactory f = new ProductoFactory();

        ProductoCreable p1 = f.newInstance(
                1,
                "Producto1",
                ProductoFactory.TipoProducto.PRODUCTO_CADUCABLE
        );

        ProductoCreable p2 = f.newInstance(
                2,
                "Producto2",
                ProductoFactory.TipoProducto.PRODUCTO_NO_CADUCABLE
        );

        Producto p3 = (Producto) f.newInstance(
                3,
                "Producto3",
                ProductoFactory.TipoProducto.PRODUCTO_CADUCABLE
        );

        ProductoCaducable pc = (ProductoCaducable) p1;
        pc.setDiasCaducidad(10);
    }
}//fin class App

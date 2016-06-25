package consola;

import Observable.EmisorEvento;
import Observable.Oyente;

public class App {

    public static void main(String[] args) {
        // TODO code application logic here
        EmisorEvento e = new EmisorEvento();
        Oyente o = new Oyente();
        
        e.addEmisorOyenteListener(o);
        e.setValor(100);
    }
}//fin class App

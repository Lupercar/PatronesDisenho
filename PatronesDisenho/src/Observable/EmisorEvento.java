package Observable;

import java.util.ArrayList;
import java.util.List;

public class EmisorEvento {
   private int valor;
   private List<EmisorEventoListener> oyentes = new ArrayList<>();

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void addEmisorOyenteListener(EmisorEventoListener oyente){
        oyentes.add(oyente); 
    }
}//fin class EmisorEvento

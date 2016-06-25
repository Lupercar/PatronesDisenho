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
        
        //se lanza el valor(se avisa)
        this.avisarOyentes(); 
    }
    
    public void addEmisorOyenteListener(EmisorEventoListener oyente){
        oyentes.add(oyente); 
    }

    private void avisarOyentes() {
        for(EmisorEventoListener oyente: oyentes){
            oyente.realizarOperacion(this.getValor());
        }
    }
}//fin class EmisorEvento

package Observable;

/*
     El patron observable se usa para avisar a otros objetos
    (instancias en memoria) que un objeto ha cambiado(lanza un evento).

    1.- Nos obliga a crear una interfaz con métodos. La cantidad de 
    métodos depende de cuantas cosas queráis avisar. 
    2.- Los oyentes tienen que implementar la interfaz.
    3.- El emisor tiene que tener métodos para añadir y eliminar un 
    oyente al que avisar. 
*/
public class Oyente implements OyenteListener{

    @Override
    public void realizarOperacion(int valor) {
        //método que se va a ejecutar cuando el emisor envíe el evento
        System.out.println("Oyente: Valor recibido: "+valor);
    }
}//fin class Oyente

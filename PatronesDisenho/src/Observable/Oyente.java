package Observable;

/*
     El patron observable se usa para avisar a otros objetos
    (instancias en memoria) que un objeto ha cambiado(lanza un evento).

    1.- Nos obliga a crear una interfaz con métodos. La cantidad de 
    métodos depende de cuantas cosas queráis avisar. 
    2.- Los oyentes tienen que implementar la interfaz.
    3.- El emisor tiene que tener métodos para añadir y eliminar un 
    oyente al que avisar. 
    4.- Tiene que tener una lista donde ir almacenando los oyentes 
    a avisar.
    5.- Cuando nos interese en el emisor avisamos a los oyentes, llamando
    al método de la interfaz que tiene que implementar el oyente.
    6.- El objeto oyente se tiene que añadir cómo un oyente del emisor.
*/
public class Oyente implements EmisorEventoListener{

    @Override
    public void realizarOperacion(int valor) {
        //método que se va a ejecutar cuando el emisor envíe el evento
        System.out.println("Oyente: Valor recibido: "+valor);
    }
}//fin class Oyente

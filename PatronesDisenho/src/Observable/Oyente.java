package Observable;

/*
     El patron observable se usa para avisar a otros objetos
    (instancias en memoria) que un objeto ha cambiado(lanza un evento).

    1.- Nos obliga a crear una interfaz con métodos. La cantidad de 
    métodos depende de cuantas cosas queráis avisar. 
    2.- Los oyentes tienen que implementar la interfaz.
*/
public class Oyente implements OyenteListener{

    @Override
    public void realizarOperacion(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//fin class Oyente

package wrapper;
//    El patron wrapper(envolvete) se usa para
//    añadir una cierta funcionalidad a una clase
//    determinada:
//    1.- Tiene que ser un Has-A de la clase base
//    2.- Tiene que tener los mismos métodos que la clase base, 
//    misma firma.
//    3.- Añadimos la funcionalidad que le va añadir el wrapper.
public class WrapperA {

    private A a;
    private int B;
    
    public int getPropA() {
        return this.a.getPropA(); 
    }

    public void setPropA(int propA) {
        this.a.setPropA(propA);
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }
}//fin class wrapperA

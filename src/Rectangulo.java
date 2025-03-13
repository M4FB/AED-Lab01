public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    //Constructor
    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);
    }
    //Getters y Setters
    public void setEsquina1(Coordenada c1) {
        esquina1 = c1;
    }
    public void setEsquina2(Coordenada c2) {
        esquina2 = c2;
    }
    public Coordenada getEsquina1() {
        return esquina1;
    }
    public Coordenada getEsquina2() {
        return esquina2;
    }
    public String toString() {
        return "Coordenadas de esquinas: " + esquina1 + ", " + esquina2;
    }
}

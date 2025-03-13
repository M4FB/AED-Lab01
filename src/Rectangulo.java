/*
La clase Rectangulo cumple con todos los requisitos:
- Dos variables: esquina1 y esquina2
- Un constructor
- Getters y Setters
- toString para crear una cadena
 */

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    //Constructor
    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = new Coordenada(c1);
        this.esquina2 = new Coordenada(c2);
    }
    //Getters y Setters
    public void setEsquina1(Coordenada c1) {
        this.esquina1 = new Coordenada(c1);
    }
    public void setEsquina2(Coordenada c2) {
        this.esquina2 = new Coordenada(c2);
    }
    public Coordenada getEsquina1() {
        return esquina1;
    }
    public Coordenada getEsquina2() {
        return esquina2;
    }
    //Metodo Para hallar el centro
    public Coordenada getCentro() {
        double centroX = (esquina1.getX() + esquina2.getX()) / 2;
        double centroY = (esquina1.getY() + esquina2.getY()) / 2;
        return new Coordenada(centroX, centroY);
    }

    public String toString() {
        return "Coordenadas de esquinas: " + esquina1 + ", " + esquina2;
    }
}

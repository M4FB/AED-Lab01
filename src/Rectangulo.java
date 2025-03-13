public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    // Constructor
    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = new Coordenada(c1);
        this.esquina2 = new Coordenada(c2);
    }

    // Getters y Setters
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

    // Centro Rectangulo
    public Coordenada getCentro() {
        double centroX = (esquina1.getX() + esquina2.getX()) / 2;
        double centroY = (esquina1.getY() + esquina2.getY()) / 2;
        return new Coordenada(centroX, centroY);
    }

    // Area Rectangulo
    public double area() {
        double ancho = Math.abs(esquina2.getX() - esquina1.getX());
        double alto = Math.abs(esquina2.getY() - esquina1.getY());
        return ancho * alto;
    }

    @Override
    public String toString() {
        return "Coordenadas de esquinas: " + esquina1 + ", " + esquina2;
    }
}

import java.util.*;

public class Coordenada {
    private Double x;
    private Double y;

    public Coordenada() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Coordenada(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }

    //Getters y Setters
    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y = y;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }

    static double Distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2));
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}


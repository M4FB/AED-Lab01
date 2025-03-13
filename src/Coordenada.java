/*
La clase coordenada cumple con todos los requisitos dados en clase:
- Dos variables X e Y
- Tres constructores
- Getters y Setters
- Metodo estático y de instancia para hallar la distancia
-toString para crear una cadena
*/

import java.util.*;
public class Coordenada {
    //Variables
    private Double x;
    private Double y;

    //Constructores
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
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }

    //Metodos
    public double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(c.x - this.x, 2) + Math.pow(c.y - this.y, 2));
    }
    public static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2));
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}


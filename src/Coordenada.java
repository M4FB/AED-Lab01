/**
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

    /**
     * Constructor por defecto que inicializa la coordenada en (0,0).
     */
    public Coordenada() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Constructor que inicializa la coordenada con valores dados.
     *
     * @param x Valor de la coordenada en el eje X.
     * @param y Valor de la coordenada en el eje Y.
     */
    public Coordenada(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor copia que crea una nueva coordenada con los valores de otra existente.
     *
     * @param c Coordenada de la cual se copiarán los valores.
     */
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
    /**
     * Calcula la distancia euclidiana entre dos cordenadas
     *
     * @param c Coordenada destino
     * @return Distancia entre las dos coordenadas
     */
    public double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(c.x - this.x, 2) + Math.pow(c.y - this.y, 2));
    }

    /**
     * Calcula la distancia euclidiana entre dos coordenadas dadas.
     *
     * @param c1 Primera coordenad
     * @param c2 Segunda coordenada
     * @return Distancia entre las dos coordenadaa
     */
    public static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2));
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}


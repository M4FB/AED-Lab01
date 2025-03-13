public class ContenedorRect {
    // Variables
    private int n;
    private Rectangulo[] listaRectangulos;
    private double[] listaDistancias;
    private double[] listaAreas;
    private int contador;

    // Constructor
    public ContenedorRect(int n) {
        this.n = n;
        this.listaRectangulos = new Rectangulo[n];
        this.listaDistancias = new double[n];
        this.listaAreas = new double[n];
        this.contador = 0;
    }

    // Agregar Rectángulo
    public void agregarRectangulo(Rectangulo r) {
        if (contador < n) {
            listaRectangulos[contador] = r;
            listaAreas[contador] = r.area(); // Suponiendo que Rectangulo tiene un método area()

            // Calcular la distancia con el rectángulo anterior si hay al menos uno almacenado
            if (contador > 0) {
                listaDistancias[contador] = calcularDistancia(listaRectangulos[contador - 1], r);
            } else {
                listaDistancias[contador] = 0; // Primer rectángulo, no hay distancia previa
            }

            contador++;
        } else {
            System.out.println("No se pueden agregar más rectángulos.");
        }
    }

    // Calcular distancia entre los centros de dos rectángulos
    private double calcularDistancia(Rectangulo r1, Rectangulo r2) {
        Coordenada c1 = r1.getCentro(); // Suponiendo que Rectangulo tiene getCentro()
        Coordenada c2 = r2.getCentro();
        return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(), 2));
    }

    // Obtener lista de rectángulos
    public Rectangulo[] getRectangulos() {
        return listaRectangulos;
    }

    // Obtener lista de áreas
    public double[] getListaAreas() {
        return listaAreas;
    }

    // Obtener lista de distancias
    public double[] getListaDistancias() {
        return listaDistancias;
    }

    // Mostrar cantidad de elementos
    public int getCantidadRectangulos() {
        return contador;
    }
}

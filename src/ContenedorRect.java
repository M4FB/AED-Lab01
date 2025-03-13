/**
 * Contenedor de rectangulos, distancias y areas.
 */
public class ContenedorRect {
    private int n; // Capacidad máxima de rectángulos
    private Rectangulo[] listaRectangulos; // Lista de rectángulos almacenados
    private double[] listaDistancias; // Lista de distancias entre los rectángulos
    private double[] listaAreas; // Lista de áreas de los rectángulos
    private int numRec; // Número actual de rectángulos almacenados

    /**
     * Constructor para inicializar el contenedor con una capacidad máxima.
     *
     * @param n Cantidad máxima de rectángulos a almacenar.
     */
    public ContenedorRect(int n) {
        this.n = n;
        this.listaRectangulos = new Rectangulo[n];
        this.listaDistancias = new double[n];
        this.listaAreas = new double[n];
        this.numRec = 0;
    }

    /**
     * Obtiene el listado de rectangulos almacenados.
     * @return Un arreglo con los rectángulos almacenados.
     */
    public Rectangulo[] getRectangulos() {
        return listaRectangulos;
    }

    /**
     * Agrega un nuevo rectángulo al contenedor.
     * @param r Rectangulo a agregar.
     */
    public void agregarRectangulo(Rectangulo r) {
        if (numRec < n) {
            listaRectangulos[numRec] = r;
            listaAreas[numRec] = r.area();

            // Calcular la distancia con el rectángulo anterior si hay al menos uno almacenado
            if (numRec > 0) {
                listaDistancias[numRec] = calcularDistancia(listaRectangulos[numRec - 1], r);
            } else {
                listaDistancias[numRec] = 0; // Primer rectángulo, no hay distancia previa
            }

            numRec++;
        } else {
            System.out.println("No se pueden agregar más rectángulos.");
        }
    }

    /**
     * Calcula la distancia entre los centros de dos rectángulos.
     * @param r1 Primer rectángulo.
     * @param r2 Segundo rectángulo.
     * @return La distancia euclidiana entre los centros de los rectángulos.
     */
    private double calcularDistancia(Rectangulo r1, Rectangulo r2) {
        Coordenada c1 = r1.getCentro();
        Coordenada c2 = r2.getCentro();
        return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(), 2));
    }
    /**
     * Representación en cadena del contenedor, mostrando los rectángulos almacenados y sus propiedades.
     * @return Cadena con la información de los rectángulos.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectángulo  Coordenadas  Distancia  Área\n");

        for (int i = 0; i < numRec; i++) {
            sb.append((i + 1) + "  " +
                    "(" + listaRectangulos[i].getEsquina1() + ", " + listaRectangulos[i].getEsquina2() + ")  " +
                    listaDistancias[i] + "  " + listaAreas[i] + "\n");
        }

        return sb.toString();
    }
}

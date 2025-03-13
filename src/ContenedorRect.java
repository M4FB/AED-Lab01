public class ContenedorRect {
    // Variables
    private int n;
    private Rectangulo[] listaRectangulos;
    private double[] listaDistancias;
    private double[] listaAreas;
    private int numRec;

    // Constructor
    public ContenedorRect(int n) {
        this.n = n;
        this.listaRectangulos = new Rectangulo[n];
        this.listaDistancias = new double[n];
        this.listaAreas = new double[n];
        this.numRec = 0;
    }

    // Agregar Rectángulo (addRectangulo)
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

    // Calcular distancia entre los centros de dos rectángulos
    private double calcularDistancia(Rectangulo r1, Rectangulo r2) {
        Coordenada c1 = r1.getCentro();
        Coordenada c2 = r2.getCentro();
        return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(), 2));
    }

    //Mostrar los Rectangulos
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

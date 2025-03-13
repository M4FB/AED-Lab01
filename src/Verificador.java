public class Verificador {
    /**
     * Ordena el rectángulo para asegurar que las esquinas estén correctamente ordenadas.
     * Se obtiene la esquina inferior izquierda y la superior derecha.
     *
     * @param r Rectángulo a normalizar.
     * @return Rectángulo con coordenadas ordenadas.
     */
    public static Rectangulo normalizar(Rectangulo r) {
        double minX = Math.min(r.getEsquina1().getX(), r.getEsquina2().getX());
        double maxX = Math.max(r.getEsquina1().getX(), r.getEsquina2().getX());
        double minY = Math.min(r.getEsquina1().getY(), r.getEsquina2().getY());
        double maxY = Math.max(r.getEsquina1().getY(), r.getEsquina2().getY());

        return new Rectangulo(new Coordenada(minX, minY), new Coordenada(maxX, maxY));
    }

    /**
     * Determina si dos rectángulos están sobrepuestos.
     *
     * @param r1 Primer rectángulo.
     * @param r2 Segundo rectángulo.
     * @return {@code true} si los rectángulos se superponen en algún punto; {@code false} en caso contrario.
     */
    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        r1 = normalizar(r1);
        r2 = normalizar(r2);

        // Verifica si hay intersección en el eje X
        boolean sobreponeX = r1.getEsquina2().getX() > r2.getEsquina1().getX() &&
                r1.getEsquina1().getX() < r2.getEsquina2().getX();

        // Verifica si hay intersección en el eje Y
        boolean sobreponeY = r1.getEsquina2().getY() > r2.getEsquina1().getY() &&
                r1.getEsquina1().getY() < r2.getEsquina2().getY();

        return sobreponeX && sobreponeY;
    }

    /**
     * Determina si dos rectángulos están juntos sin superponerse.
     *
     * @param r1 Primer rectángulo.
     * @param r2 Segundo rectángulo.
     * @return {@code true} si los rectángulos están adyacentes sin superponerse; {@code false} en caso contrario.
     */
    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        r1 = normalizar(r1);
        r2 = normalizar(r2);

        boolean tocaVertical = (r1.getEsquina2().getX() == r2.getEsquina1().getX() ||
                r1.getEsquina1().getX() == r2.getEsquina2().getX()) &&
                (r1.getEsquina2().getY() > r2.getEsquina1().getY() &&
                        r1.getEsquina1().getY() < r2.getEsquina2().getY());

        boolean tocaHorizontal = (r1.getEsquina2().getY() == r2.getEsquina1().getY() ||
                r1.getEsquina1().getY() == r2.getEsquina2().getY()) &&
                (r1.getEsquina2().getX() > r2.getEsquina1().getX() &&
                        r1.getEsquina1().getX() < r2.getEsquina2().getX());

        boolean tocaEsquina = (r1.getEsquina2().getX() == r2.getEsquina1().getX() &&
                r1.getEsquina2().getY() == r2.getEsquina1().getY()) ||
                (r1.getEsquina1().getX() == r2.getEsquina2().getX() &&
                        r1.getEsquina1().getY() == r2.getEsquina2().getY());

        return (tocaVertical || tocaHorizontal || tocaEsquina) && !esSobrePos(r1, r2);
    }

    /**
     * Determina si dos rectángulos están completamente separados, es decir, no se tocan ni se superponen en ningún punto.
     *
     * @param r1 Primer rectángulo.
     * @param r2 Segundo rectángulo.
     * @return {@code true} si los rectángulos están completamente separados; {@code false} en caso contrario.
     */
    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        return !esSobrePos(r1, r2) && !esJunto(r1, r2);
    }
}

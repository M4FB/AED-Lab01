public class Verificador {
    /**
     * Determina si dos rectángulos están sobrepuestos
     *
     * @param r1 Primer rectángulo.
     * @param r2 Segundo rectángulo.
     * @return {@code true} si los rectángulos se superponen en algún punto; {@code false} en caso contrario.
     */
    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        // Verifica la superposición en el eje X
        boolean sobreponeX = r1.getEsquina1().getX() < r2.getEsquina2().getX() &&
                r1.getEsquina2().getX() > r2.getEsquina1().getX();

        // Verifica la superposición en el eje Y
        boolean sobreponeY = r1.getEsquina1().getY() < r2.getEsquina2().getY() &&
                r1.getEsquina2().getY() > r2.getEsquina1().getY();

        // Se considera que hay superposición si coinciden en ambos ejes.
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
        // Verifica si los rectángulos comparten un lado verticalmente sin superponerse en el eje Y.
        boolean tocaVertical = (r1.getEsquina2().getX() == r2.getEsquina1().getX() ||
                r1.getEsquina1().getX() == r2.getEsquina2().getX()) &&
                !(r1.getEsquina2().getY() <= r2.getEsquina1().getY() ||
                        r1.getEsquina1().getY() >= r2.getEsquina2().getY());

        // Verifica si los rectángulos comparten un lado horizontalmente sin superponerse en el eje X.
        boolean tocaHorizontal = (r1.getEsquina2().getY() == r2.getEsquina1().getY() ||
                r1.getEsquina1().getY() == r2.getEsquina2().getY()) &&
                !(r1.getEsquina2().getX() <= r2.getEsquina1().getX() ||
                        r1.getEsquina1().getX() >= r2.getEsquina2().getX());

        // Verifica si los rectángulos comparten exactamente una esquina.
        boolean tocaEsquina = (r1.getEsquina2().getX() == r2.getEsquina1().getX() &&
                r1.getEsquina2().getY() == r2.getEsquina1().getY()) ||
                (r1.getEsquina1().getX() == r2.getEsquina2().getX() &&
                        r1.getEsquina1().getY() == r2.getEsquina2().getY());

        // Si están juntos sin superponerse, retornamos true.
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
        // Un rectángulo es disjunto si no se sobrepone ni está junto al otro.
        return !esSobrePos(r1, r2) && !esJunto(r1, r2);
    }
}

public class Verificador {
    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        // Se superponen si no hay separación en ningún eje
        return !(r1.getEsquina2().getX() < r2.getEsquina1().getX() ||
                r1.getEsquina1().getX() > r2.getEsquina2().getX() ||
                r1.getEsquina2().getY() < r2.getEsquina1().getY() ||
                r1.getEsquina1().getY() > r2.getEsquina2().getY());
    }

    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        // Se tocan en algún lado o esquina sin superponerse
        boolean tocaLados = (r1.getEsquina2().getX() == r2.getEsquina1().getX() ||
                             r1.getEsquina1().getX() == r2.getEsquina2().getX() ||
                             r1.getEsquina2().getY() == r2.getEsquina1().getY() ||
                             r1.getEsquina1().getY() == r2.getEsquina2().getY());
        return tocaLados && !esSobrePos(r1, r2);
    }

    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        // Son disjuntos si ni se superponen ni se tocan
        return !esSobrePos(r1, r2) && !esJunto(r1, r2);
    }
}

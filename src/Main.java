import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una esquina del Rectángulo A:");
        double x1A = scanner.nextDouble();
        double y1A = scanner.nextDouble();
        System.out.println("Ingrese la esquina opuesta del Rectángulo A:");
        double x2A = scanner.nextDouble();
        double y2A = scanner.nextDouble();

        Rectangulo A = new Rectangulo(new Coordenada(x1A, y1A), new Coordenada(x2A, y2A));

        System.out.println("Ingrese una del Rectángulo B:");
        double x1B = scanner.nextDouble();
        double y1B = scanner.nextDouble();

        System.out.println("Ingrese la esquina opuesta del Rectángulo B:");
        double x2B = scanner.nextDouble();
        double y2B = scanner.nextDouble();

        Rectangulo B = new Rectangulo(new Coordenada(x1B, y1B), new Coordenada(x2B, y2B));

        System.out.println("Rectángulo A: " + A);
        System.out.println("Rectángulo B: " + B);


        System.out.println("¿Uno está sobre otro? " + Verificador.esSobrePos(A, B));
        System.out.println("¿Están lado a lado? " + Verificador.esJunto(A, B));
        System.out.println("¿Están separados? " + Verificador.esDisjunto(A, B));

        scanner.close();
    }
}
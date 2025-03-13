import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera esquina del Rectángulo A:");
        double x1A = scanner.nextDouble();
        double y1A = scanner.nextDouble();
        System.out.println("Ingrese la segunda esquina del Rectángulo A:");
        double x2A = scanner.nextDouble();
        double y2A = scanner.nextDouble();

        Rectangulo A = new Rectangulo(new Coordenada(x1A, y1A), new Coordenada(x2A, y2A));

        System.out.println("Ingrese la primera esquina del Rectángulo B:");
        double x1B = scanner.nextDouble();
        double y1B = scanner.nextDouble();

        System.out.println("Ingrese la segunda esquina del Rectángulo B:");
        double x2B = scanner.nextDouble();
        double y2B = scanner.nextDouble();

        Rectangulo B = new Rectangulo(new Coordenada(x1B, y1B), new Coordenada(x2B, y2B));

        System.out.println("Rectángulo A: " + A);
        System.out.println("Rectángulo B: " + B);


        int opcion;
        System.out.println("\nIngrese una opcion:");
        System.out.println("1. Verificar si uno está sobre otro");
        System.out.println("2. Verificar si están lado a lado");
        System.out.println("3. Verificar si están separados");
        System.out.println("4. Realizar todas las comprobaciones");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Uno está sobre otro? " + Verificador.esSobrePos(A, B));
                break;
            case 2:
                System.out.println("¿Están lado a lado? " + Verificador.esJunto(A, B));
                break;
            case 3:
                System.out.println("¿Están separados? " + Verificador.esDisjunto(A, B));
                break;
            case 4:
                System.out.println("¿Uno está sobre otro? " + Verificador.esSobrePos(A, B));
                System.out.println("¿Están lado a lado? " + Verificador.esJunto(A, B));
                System.out.println("¿Están separados? " + Verificador.esDisjunto(A, B));
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
        }
        scanner.close();
    }
}
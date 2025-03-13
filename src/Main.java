import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir la cantidad máxima de rectángulos en el contenedor
        System.out.print("Ingrese la cantidad máxima de rectángulos a almacenar: ");
        int n = scanner.nextInt();
        ContenedorRect contenedor = new ContenedorRect(n);

        // Agregar rectángulos al contenedor
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese una esquina del Rectángulo " + (i + 1) + ":");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            System.out.println("Ingrese la esquina opuesta del Rectángulo " + (i + 1) + ":");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            Rectangulo rect = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
            contenedor.agregarRectangulo(rect);
        }

        // Mostrar el contenido del contenedor de rectángulos
        System.out.println("\nRectángulos almacenados:");
        System.out.println(contenedor);

        // Seleccionar dos rectángulos para comparar
        System.out.println("\nSeleccione dos rectángulos por su índice (del 1 al " + n + ") para comparar:");
        int index1, index2;

        do {
            System.out.print("Seleccione el primer rectángulo: ");
            index1 = scanner.nextInt();
        } while (index1 < 1 || index1 > n);

        do {
            System.out.print("Seleccione el segundo rectángulo: ");
            index2 = scanner.nextInt();
        } while (index2 < 1 || index2 > n || index2 == index1);

        // Obtener los rectángulos seleccionados
        Rectangulo A = contenedor.getRectangulos()[index1 - 1];
        Rectangulo B = contenedor.getRectangulos()[index2 - 1];

        // Realizar comparaciones con Verificador
        System.out.println("\nComparación de Rectángulo " + index1 + " y Rectángulo " + index2 + ":");
        System.out.println("¿Uno está sobre otro? " + Verificador.esSobrePos(A, B));
        System.out.println("¿Están lado a lado? " + Verificador.esJunto(A, B));
        System.out.println("¿Están separados? " + Verificador.esDisjunto(A, B));

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejer1_Distancia {

    public static void main(String[] args) {

        // 1. Esto es para poder escribir en el teclado
        Scanner teclado = new Scanner(System.in);

        // 2. Pido el primer punto
        System.out.println("Dame el primer punto");
        System.out.print("x1: ");
        double x1 = teclado.nextDouble();

        System.out.print("y1: ");
        double y1 = teclado.nextDouble();

        // 3. Pido el segundo punto
        System.out.println("Dame el segundo punto");
        System.out.print("x2: ");
        double x2 = teclado.nextDouble();

        System.out.print("y2: ");
        double y2 = teclado.nextDouble();

        // 4. Calculo cuanto se movio en x y en y
        // Ejemplo: si x1 es 0 y x2 es 3, se movio 3
        double dx = x2 - x1;
        double dy = y2 - y1;

        // 5. Aqui uso lo de la biblioteca Math, no invento nada
        // Math.pow(dx, 2) es lo mismo que dx * dx, o sea dx al cuadrado
        // Math.sqrt es la raiz cuadrada
        double distancia = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        // 6. Muestro el resultado
        System.out.println("La distancia es: " + distancia);

        teclado.close();
    }
}
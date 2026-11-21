import java.util.Scanner;

public class Ejer3_Contraseña {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe tu contrasena: ");
        String contrasena = teclado.nextLine();

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char letra = contrasena.charAt(i);

            if (Character.isUpperCase(letra)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(letra)) {
                tieneDigito = true;
            }
        }

        if (contrasena.length() >= 8 && tieneMayuscula && tieneDigito) {
            System.out.println("Contrasena valida");
        } else {
            System.out.println("Contrasena no valida");
        }

        if (contrasena.length() < 8) {
            System.out.println("Le faltan caracteres, debe tener minimo 8");
        }

        if (tieneMayuscula == false) {
            System.out.println("Le falta una mayuscula");
        }

        if (tieneDigito == false) {
            System.out.println("Le falta un digito");
        }

        teclado.close();
    }
}

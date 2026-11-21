import java.util.Scanner;
public class Ejer4_Vocales {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = teclado.nextLine();

        frase = frase.toLowerCase();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador = contador + 1;
            }
        }

        System.out.println("Tu frase tiene " + contador + " vocales");

        teclado.close();
    }
}



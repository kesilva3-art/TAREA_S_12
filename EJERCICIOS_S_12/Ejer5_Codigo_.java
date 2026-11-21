import java.util.Random;

public class Ejer5_Codigo_ {

    public static void main(String[] args) {

        Random azar = new Random();

        char letra1 = (char) ('A' + azar.nextInt(26));
        char letra2 = (char) ('A' + azar.nextInt(26));
        char letra3 = (char) ('A' + azar.nextInt(26));

        int numero1 = azar.nextInt(10);
        int numero2 = azar.nextInt(10);
        int numero3 = azar.nextInt(10);

        System.out.print("Tu codigo es: ");
        System.out.print(letra1);
        System.out.print(letra2);
        System.out.print(letra3);
        System.out.print(numero1);
        System.out.print(numero2);
        System.out.println(numero3);
    }
}
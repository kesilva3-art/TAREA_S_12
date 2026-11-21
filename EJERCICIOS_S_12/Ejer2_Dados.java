import java.util.Random;

public class Ejer2_Dados {

    public static void main(String[] args) {

        Random azar = new Random();

        int vecesQueSalio7 = 0;

        for (int i = 1; i <= 1000; i++) {

            int dado1 = azar.nextInt(6) + 1;

            // Tiro el segundo dado, igual que el primero
            int dado2 = azar.nextInt(6) + 1;

            int suma = dado1 + dado2;

            if (suma == 7) {
                vecesQueSalio7 = vecesQueSalio7 + 1;
            }
        }

        System.out.println("Tire los dados 1000 veces");
        System.out.println("La suma 7 salio: " + vecesQueSalio7 + " veces");
    }
}

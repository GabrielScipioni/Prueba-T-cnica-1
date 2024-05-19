package gabri.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dna = new String[6];

        System.out.println("Ingrese las secuencias de ADN (6 líneas, 6 caracteres cada una):");

        for (int i = 0; i < 6; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            dna[i] = scanner.nextLine().toUpperCase();
            while (dna[i].length() != 6) {
                System.out.println("La cadena debe tener exactamente 6 caracteres. Inténtelo de nuevo.");
                System.out.print("Cadena " + (i + 1) + ": ");
                dna[i] = scanner.nextLine().toUpperCase();
            }
        }

        DNA dnaChecker = new DNA();
        boolean result = dnaChecker.isMutant(dna);

        if (result) {
            System.out.println("El ADN pertenece a un mutante.");
        } else {
            System.out.println("El ADN pertenece a un humano.");
        }

        scanner.close();
    }
}

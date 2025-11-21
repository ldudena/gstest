package utils;

import java.util.Scanner;

public class IOUtils {
    public static int scanInt(Scanner scanner) {
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}
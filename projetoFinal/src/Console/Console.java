package Console;

import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static String lerString() {
        String valor = leitor.next();
        return valor;
    }

    public static int lerInt() {
        int valor = leitor.nextInt();
        return valor;
    }
}

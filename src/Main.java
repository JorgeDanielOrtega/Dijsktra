import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static Boolean esNumeroPrimo(int num) {
        int band = -1;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                band++;
            }
        }
        return band == 1;
    }

    public static void verificarNumeroPrimo() {
        System.out.println("Inserte un numero: ");
        int num = input.nextInt();
        if (esNumeroPrimo(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }

    public static void calcularFibonacci(int limit) {
        List<Integer> serie = new LinkedList<>();
        Integer a = 0;
        Integer b = 1;
        Integer  aux = 0;

        for (int i = 0; i < limit; i++) {
            serie.add(a);
            aux = a + b;
            a = b;
            b = aux;
        }

        System.out.println(serie.toString());
    }

    public static void main(String[] args) {
//        verificarNumeroPrimo();
//        calcularFibonacci(25);
        System.out.println(String.class.equals(Object.class));
    }

}
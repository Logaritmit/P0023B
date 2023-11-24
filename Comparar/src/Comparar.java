import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
        }
    }
}


//se puede llamar un atributo dentro de una clase
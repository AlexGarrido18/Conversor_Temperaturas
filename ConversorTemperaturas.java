import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Grados Fahrenheit: " + fahrenheit);
    }
}

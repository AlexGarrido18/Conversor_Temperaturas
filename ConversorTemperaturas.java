import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
    //    Programador B: Fahrenheit a Celsius 

    Scanner sc = new Scanner(System.in);

System.out.print("Introduce los grados Fahrenheit: ");
double fahrenheit = sc.nextDouble();

double celsius = (fahrenheit - 32) * 5.0 / 9.0;

System.out.println("Grados Celsius: " + celsius);

}
}
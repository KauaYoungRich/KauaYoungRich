/*algoritmo para calcular o raio da circunferencia
 * Kaua Araujo
 * 08/05/2023
 */
import java.util.Scanner;
public class atividade5{
    public static void main(String args[]) {
    Scanner texto = new Scanner(System.in);
    double n1;
    double perimetro;
    System.out.println("digite o raio da circuferencia: ");
    n1 = texto.nextDouble();
    perimetro = 6.28 * n1;
    System.out.println("O perimetro da circuferencia é de: "+ perimetro);
    }
}
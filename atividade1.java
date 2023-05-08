/*Algoritmo para mostrar a média
 * Kauã Araujo de Amorim Silva
 * 08/05/23
 */
//importar classe
import java.util.Scanner;
//declarar classe
public class atividade1{
public static void main(String args[]){
    Scanner leitor = new Scanner(System.in);
    double n1, n2, n3, n4, media;
    media = n1 = n2 = n3 = n4 = 0;
    System.out.println("Insire 4 notas: ");
    n1= leitor.nextDouble();
    n2= leitor.nextDouble();
    n3= leitor.nextDouble();
    n4= leitor.nextDouble();
    media = (n1+n2+n3+n4)/4;
    System.out.println("A media é: "+media);
   }
}

/*algoritmo para mostrar faixa etaria
 * Kaua Araujo
 * 09/05/23
 */
import java.util.Scanner;
public class atividade4 {
    public static void main(String args[]) {
    Scanner texto = new Scanner(System.in);
    int n1;
    System.out.println("digite sua idade: ");
    n1 = texto.nextInt();
    if(n1<=12){
    System.out.println("sua faixa etaria é criança");}
    else if (n1>12 && n1>=19){
    System.out.println("sua faixa etaria é adolescente");}
    else if (n1>12 && n1<=65){
    System.out.println("sua faixa etaria é adulto");}
    else{
    System.out.println("sua faixa etaria é idoso");}
    }
}
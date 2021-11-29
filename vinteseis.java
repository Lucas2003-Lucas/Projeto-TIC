/*26 – Faça um programa em Java que receba um número positivo e maior que zero, calcule e mostre:  
a) o número digitado ao quadrado; 
b) o número digitado ao cubo; 
c) a raiz quadrada do número digitado; 
d) a raiz cúbica do número digitado.  */
 import java.util.Scanner;
public class vinteseis{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int n=ns.nextInt();
System.out.println("O quadrado do numero e "+Math.pow(n,2));
System.out.println("O cubo do numero e "+Math.pow(n,3));
System.out.println(" A raiz quadrada do numero e "+Math.sqrt(n));
//System.out.println("A raiz cubica do numero e "+)Math.sqrt(n,3);
}
    }
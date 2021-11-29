/*28 – Faça um programa em Java que receba o número de horas trabalhadas e o valor do salário mínimo, 
calcule e mostre o salário a receber, seguindo estas regras: 
a) a hora trabalhada vale a metade do salário mínimo.
 b) o salário bruto equivale ao número de horas trabalhadas multiplicado
  pelo valor da hora trabalhada.
c) o imposto equivale a 3% do salário bruto. 
d) o salário a receber equivale ao salário bruto menos o imposto. */
 import java.util.Scanner;
public class vinteoito{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int horat=ns.nextInt();
int salmin=ns.nextInt();
int novosal;
int sb;
int impos;
sb=horat*(salmin/2);
System.out.println("O valor do salario bruto e "+sb);
impos=sb*3/100;
System.out.println("O valor do imposto e de "+impos);
novosal=sb-impos;
System.out.println("O salario a receber e de "+novosal);
}
    }
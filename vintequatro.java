/*24 – Faça um programa em Java que receba o salário base de um funcionário, 
calcule e mostre seu salário a receber, 
sabendo-se que o funcionário tem gratificação de R$ 50 e paga imposto de 10% sobre o salário base. */
 import java.util.Scanner;
public class vintequatro{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int sal=ns.nextInt();
int novosal;
int impos;
impos=sal*10/100;
novosal=sal+50-impos;
System.out.println("O salario a rceber sera de "+novosal);
}
    }
/*21 – Faça um programa em Java que receba o salário base de um funcionário, 
calcule e mostre o salário a receber,
 sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e 
paga imposto de 7% também sobre o salário base.  */
 import java.util.Scanner;
public class vinteum{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int sal=ns.nextInt();
int salrec;
int impos;
int grat;
impos=sal*7/100;
System.out.println("Imposto="+impos);
grat=sal*5/100;
System.out.println("Gratificacao="+grat);
salrec=sal+grat-impos;
System.out.println("O salario a receber e de "+salrec);
}
    }
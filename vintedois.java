/*22 – Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. 
Faça um programa em Java que receba o salário fixo do funcionário e o valor de suas vendas, 
calcule e mostre a comissão e seu salário final. */
 import java.util.Scanner;
public class vintedois{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int sal=ns.nextInt();
int valorvenda=ns.nextInt();
int salfinal;
int comis;
comis=valorvenda*4/100;
salfinal=sal+comis;
System.out.println("A comissao das vendas e de "+comis+" e o salario final e "+salfinal);
}
    }
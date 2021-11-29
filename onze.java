/*11 – Faça um programa em Java que receba o valor do salário mínimo 
e o valor do salário de um funcionário, 
calcule e mostre a quantidade de salários mínimos que esse funcionário ganha.  */
 import java.util.Scanner;
public class onze{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int salario=ns.nextInt();
int salariomin=ns.nextInt();
int qtdmin;
qtdmin=salario/salariomin;
System.out.println("A quantidade de salarios minimos do funcionario e de "+qtdmin);
}
    }
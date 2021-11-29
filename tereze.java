/*13 – Faça um programa em Java que receba o ano de nascimento de uma pessoa e
 o ano atual, calcule e mostre:  
a) a idade dessa pessoa;
 b) quantos anos ela terá em 2050. */
 import java.util.Scanner;
public class tereze{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int anonascimento=ns.nextInt();
int anoatual=ns.nextInt();
int idade;
int idade2050;
idade=anoatual-anonascimento;
idade2050=2050-anonascimento;
System.out.println("A idade da pessoa e "+idade);
System.out.println("A idade da pessoa em 2050 sera "+idade2050);

}
    }
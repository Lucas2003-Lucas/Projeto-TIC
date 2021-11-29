/*6 – Faça um programa em Java que receba três notas e seus respectivos pesos,
 calcule e mostre a média ponderada.*/
 import java.util.Scanner;
public class sexto{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);

int a=ns.nextInt();
int b=ns.nextInt();
int c=ns.nextInt();
int p1=ns.nextInt();
int p2=ns.nextInt();
int p3=ns.nextInt();
int mp;
mp=a*p1+b*p2+c*p3/(p1+p2+p3);
System.out.println("A media ponderada e "+mp);
}
    }
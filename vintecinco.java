/*25 – Faça um programa em Java que receba o valor de um depósito e o valor da taxa de juros,
 calcule e mostre o valor do rendimento e o valor total depois do rendimento.  */
 import java.util.Scanner;
public class vintecinco{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int depo=ns.nextInt();
int jur=ns.nextInt();
int vr;
int tot;
vr=depo*jur/100;
tot=depo+vr;
System.out.println("O valor de rendimento e "+vr+" e o total depois do rendimento e "+tot);
}
    }
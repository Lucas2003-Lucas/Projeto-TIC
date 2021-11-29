/*7 – Faça um programa em Java que calcule e mostre a área de um losango.
 Sabese que: A = (diagonal maior * diagonal menor) /2*/
 import java.util.Scanner;
public class setimo{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);

double a;
float dmaior=ns.nextFloat();
float dmenor=ns.nextFloat();
a=(dmaior*dmenor)/2;
System.out.println("A area do lasango e "+a);
}
    }
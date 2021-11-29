/*8 – Faça um programa em Java que calcule e mostre a área de um quadrado.
 Sabe-se que: A = lado * lado.*/
 import java.util.Scanner;
public class oitavo{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);

float area;
float lado=ns.nextFloat();
area=lado*lado;
System.out.println("A area do quadrado e  "+area);
}
    }
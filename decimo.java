/*9 10 – Faça um programa em Java que calcule e mostre a área de um trapézio. 
Sabe-se que: A = ((base maior + base menor) * altura) /2 */
 import java.util.Scanner;
public class decimo{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);

float area;
float basemaior=ns.nextFloat();
float basemenor=ns.nextFloat();
float altura=ns.nextFloat();
area=((basemaior+basemenor)*altura)/2;
System.out.println("A area do trapezio e "+area);
}
    }
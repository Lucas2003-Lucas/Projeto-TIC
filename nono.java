/*9 – Faça um programa em Java que receba o peso de uma pessoa em quilos, 
calcule e mostre esse peso em gramas.*/
 import java.util.Scanner;
public class nono{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);

float peso=ns.nextFloat();
float pesograma;
pesograma=peso*1000;
System.out.println("O peso em gramas sera "+pesograma);
}
    }
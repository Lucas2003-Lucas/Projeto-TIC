/*15 – Faça um programa em Java que receba dois números maiores que zero,
 calcule e mostre um elevado ao outro.   */
 import java.util.Scanner;
public class quinze{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int x=ns.nextInt();
int y=ns.nextInt();
Math.pow(x,y);
System.out.println("O resultade de "+x+" elevado a "+y+" e "+Math.pow(x,y));

}
    }
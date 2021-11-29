/*23 – Faça um programa em Java que receba o peso de uma pessoa, calcule e mostre: 
a) o novo peso, se a pessoa engordar 15% sobre o peso digitado; 
 b) o novo peso, se a pessoa emagrecer 20% sobre o peso digitado. */
 import java.util.Scanner;
public class vintetres{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
float p=ns.nextFloat();
float nvengor;
float nemagre;

nvengor=p+(p*15/100);
nemagre=p-(p*20/100);
System.out.println("Se a pessoa engordar 15% o novo peso sera de "+nvengor+"KG");
System.out.println("Se a pessoa emagrecer 20% o novo peso sera de "+nemagre+"KG");
}
    }
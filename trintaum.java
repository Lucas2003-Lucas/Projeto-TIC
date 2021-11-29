/*31 – Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
Faça um programa em Java que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência. 
Calcule e mostre: 
a) o valor de cada quilowatt; 
b) o valor a ser pago por essa residência; 
c) o valor a ser pago com desconto de 15% */
 import java.util.Scanner;
public class trintaum{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int salmin=ns.nextInt();
int qtdkw=ns.nextInt();
int valorkw;
int valord;
int valor15;
int des;
valorkw=salmin/5;
valord=valorkw*qtdkw;
des=valord*15/100;
valor15=valord-des;
System.out.println("O valor de cada quilowatt e "+valorkw+"Kz");
System.out.println("O valor a ser pago pela residência e "+valord+"Kz");
System.out.println("O valor a ser pago com desconto de 15% e de "+valor15+"Kz");

    }}
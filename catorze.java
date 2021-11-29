/*14 – Faça um programa em Java que receba o ano de nascimento de uma pessoa e o ano atual,
 calcule e mostre: 
a) a idade dessa pessoa em anos; 
b) a idade dessa pessoa em meses; 
c) a idade dessa pessoa em dias;
 d) a idade dessa pessoa em semanas.  */
 import java.util.Scanner;
public class catorze{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int anonascimento=ns.nextInt();
int anoatual=ns.nextInt();
int idade;
int idademeses;
int idadedias;
int idadesemanas;
idade=anoatual-anonascimento;
System.out.println("A idade em anos e "+idade);
idademeses=idade*12;
System.out.println("A idade em meses e "+idademeses);
idadedias=idade*365;
System.out.println("A idade em dia e "+idadedias);
idadesemanas=idademeses*4;
System.out.println("A idade em semanas e "+idadesemanas);
}
    }
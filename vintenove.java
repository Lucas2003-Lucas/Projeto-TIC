
 import java.util.Scanner;
public class vintenove{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
float sal=ns.nextFloat();
float cheque1=ns.nextFloat();
float cheque2=ns.nextFloat();
float oper1;
float oper2;
float sald;

oper1=cheque1*(38/100)/100;
oper2=cheque2*(38/100)/100;
sald=sal-cheque1-cheque2-oper1-oper2;
System.out.println("A saldo e de "+sald);
}
    }

 import java.util.Scanner;
public class dezanove{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
float sal=ns.nextFloat();
float percent=ns.nextFloat();
float novosal;
float valoraumento;

valoraumento=sal*percent/100;

novosal=sal+valoraumento;

System.out.println("O novo salario e "+novosal+" e o valor do aumento e de "+valoraumento);

}
    }
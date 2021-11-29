/**/
 import java.util.Scanner;
public class dezassete{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
float sal=ns.nextFloat();
float novosal;
float percent;
percent=sal*25/100;
novosal=sal+percent;
System.out.println("O novo salario e "+novosal);

}
    }

 import java.util.Scanner;
public class vinte{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int cost=ns.nextInt();
int prec=ns.nextInt();
int qtd;
qtd=cost/prec;
System.out.println("Para que o custo seja alcancado devem ser vendidos pelo menos "+qtd+" convites");
}
    }
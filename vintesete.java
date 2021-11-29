
 import java.util.Scanner;
public class vintesete{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
int vc=ns.nextInt();
int ld=ns.nextInt();
int impos=ns.nextInt();
int valorld;
int valorimpos;
int percvc;
valorld=vc*ld/100;
valorimpos=vc*impos/100;
percvc=vc+valorld+valorimpos;
System.out.println("O valor correspondente ao lucro do distribuidor e de "+valorld);
System.out.println("O valor correspondente ao imposto aplicado pela fabrica e de "+valorimpos);
System.out.println("O preco final do veiculo e de "+percvc);
}
    }
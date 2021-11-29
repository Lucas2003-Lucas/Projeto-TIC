/**/
 import java.util.Scanner;
public class dezoito{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
float prec=ns.nextFloat();
float novoprec;
float percent;
percent=prec*10/100;
novoprec=prec-percent;
System.out.println("O novo preco e "+novoprec);

}
    }
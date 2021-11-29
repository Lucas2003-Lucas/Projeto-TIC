/*  */
 import java.util.Scanner;
public class dezasseis{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
float pes=ns.nextFloat();
float pol;
float jardas;
float milhas;
pol=pes*12;
jardas=pes/3;
milhas=jardas/1760;
System.out.println(pes+" pes->"+pol+" polegadas");
System.out.println(pes+" pes->"+jardas+" jardas");
System.out.println(pes+" pes->"+milhas+" milhas");
}
    }
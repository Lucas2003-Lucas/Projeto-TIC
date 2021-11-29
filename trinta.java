
 import java.util.Scanner;
public class trinta{

public static void main(String [] args){     
    Scanner ns=new Scanner(System.in);
float saco=ns.nextFloat();
float qtd1=ns.nextFloat();
float qtd2=ns.nextFloat();
float nqtd1;
float nqtd2;
float resto;
nqtd1=qtd1*1/1000;
System.out.println(qtd1+"->"+nqtd1);
nqtd2=qtd2*1/1000;
System.out.println(qtd2+"->"+nqtd2);
resto=saco-5*(nqtd1+nqtd2);
if(resto<=0){
    System.out.println("Apos 5 dias nao restara nada!");

}else{
System.out.println("Apos 5 dias restara "+resto+"KG");}
}
    }
import java.util.Scanner;

public class Reto6{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);
        
        String nombre;
        int mon;
        int dineApo, v;
        int  total=0, total1=0;


        
        System.out.println("Ingrese su nombre");
        nombre=lector.nextLine();
        System.out.println("Ingrese cuanto dinero quiere apostar");
        dineApo=lector.nextInt();
        System.out.println("ingrese cuantas veces quiere jugar");
        v=lector.nextInt();
        for(int i = 0; i <v; i++)
        {
            System.out.println("que desea. 1 cara o 2 sello");
            mon=lector.nextInt();
            int maquina = (int)(Math.random()*2);
            if(mon==maquina){
                System.out.println("usted gano la apuesta");
                total=dineApo*2;
                System.out.println("usted va acomulando este valor: "+total);

            }
            else if(mon != maquina){
                System.out.println("usted perdio la apuesta");
                total1=total1-total;
                System.out.println("usted va perdiendo este valor: "+total1);
            }
        }
            System.out.println("usted jugo:"+v+"veces, y acomulo un total de:"+total);
           
        
    lector.close();
    }
}
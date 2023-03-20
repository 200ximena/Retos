import java.util.Scanner;

public class Reto3{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        String nombre;
        int mon;
        int dineApo;
        int monto=10000;
        
        System.out.println("Ingrese su nombre");
        nombre=lector.nextLine();
        System.out.println("Ingrese cuanto dinero quiere apostar");
        dineApo=lector.nextInt();
        if(dineApo >10000)
        {
            System.out.println("que desea. 1. cara o 2. sello");
            mon=lector.nextInt();
            int maquina = (int)(Math.random()*2);
            if(mon==maquina){
                System.out.println("usted gano la apuesta, se lleva el monto de: "+monto+ "\njunto con su dinero apostado" +dineApo);
            }
            else if(mon != maquina){
                System.out.println("usted perdio la apuesta, pierde el monto de:"+monto+ "  \n junto con su dinero apostado: "+dineApo);
            }
        }
         else{
            System.out.println("debe apostar mas dinero");
         }   
        
    lector.close();
    }
}

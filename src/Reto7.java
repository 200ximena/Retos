import java.util.Scanner;

public class Reto7{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        String nombre;
        int dineApos, op;
        int  total=0, total1=0;
        int vidas=4;
        int vidas1;
        System.out.println("Recuerde que solo tiene 4 vidas");
        System.out.println("Ingrese su nombre");
        nombre=lector.nextLine();
        System.out.println("Ingrese cuanto dinero quiere apostar");
        dineApos=lector.nextInt();
        for(int i =0; i<vidas; i++)
        {
            System.out.println("que opccion quiere elegir: \n Escriba: 1 si dese sacar :Piedra\nEscriba: 2 si dese sacar :papel\nEscriba: 3 i dese sacar :tijera");
            op=lector.nextInt();
            int maquina = (int)(Math.random()*3);
            if (op == maquina){
                System.out.println("usted ha quedado en empate con la maquina");

                
            }
            else if ((op ==1 && maquina ==3 )||(op == 2 && maquina ==1)||(op == 3 && maquina == 2)){
                total=dineApos*2;
                System.out.println("usted ha ganado!!");
                System.out.println("Se lleva un total de $"+total);
            }
            else {
                System.out.println("Usted  "+nombre+  " ha perdido en el juego");
                total1=total1-total;
                System.out.println("usted va perdiendo este valor  "+total1);
                vidas1=vidas-i;
                System.out.println("Le quedan estas vidas:  "+vidas1);
            }
        } 

        lector.close();
         }   
    }
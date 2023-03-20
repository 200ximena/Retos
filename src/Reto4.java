import java.util.Scanner;

public class Reto4{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        String nombre;
        int dineApos, op;
        int  total;

        System.out.println("Ingrese su nombre");
        nombre=lector.nextLine();
        System.out.println("Ingrese cuanto dinero quiere apostar");
        dineApos=lector.nextInt();
        if(dineApos >10000)
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
                System.out.println("Usted  "+nombre+"ha perdido en el juego, incluyendo su dinero  "+dineApos);
            }
        } 
         else{
            System.out.println("debe apostar mas dinero");
         }   
        
    lector.close();
    }
}

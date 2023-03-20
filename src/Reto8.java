import java.util.Scanner;

public class Reto8{
    public  static void main (String []args){ 
        
        Scanner lector=new Scanner(System.in);
       
        int i=0;
        int num;
        int intentos=10;
        int numMaquina = (int) ((Math.random() * 100)+1);

            System.out.println("Tienes 10 intentos para adivinar el numero entre 1 y 100. Escribe un número");
            num=lector.nextInt();
            for (i=0; i<intentos; i++){
                if (numMaquina == num){
                    System.out.println("¡Has acertado!"); 
                }
                else if (numMaquina>num){
                    System.out.println("el numero es mayor "); 
                    System.out.println("Ingresa otro numero");
                    num=lector.nextInt();
                }
                else if (numMaquina<num){
                    System.out.println("el numero es menor "); 
                    System.out.println("ingresa otro numero");
                    num=lector.nextInt();
                    
                }
                else {
                    System.out.println("has perdido los intentos"); 
                }
            }System.out.println(" El número era el: " +numMaquina); 

     lector.close();
    }
}
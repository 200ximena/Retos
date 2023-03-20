import java.util.Scanner;

public class Reto2{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        Double tempC, tempK;
        
        System.out.println("ingrese la temperatura en grados kelvin a convertir");
        tempK=lector.nextDouble();
        tempC=tempK-273.15;
        System.out.println("la temperatura ingresada equivale a: "+tempC+" grados celsius");
    lector.close();
    }
}
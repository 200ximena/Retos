import java.util.Scanner;
public class Reto1{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        String nombreMm, nombreBb, nomVacuna;
        Double peso, cantidadDosis, mesesBb;
        
        
        System.out.println("ingrese el nombre de la mama del bebe");
        nombreMm=lector.nextLine();
        System.out.println("ingrese el nombre del  bebe ");
        nombreBb=lector.nextLine();
        System.out.println("ingrese el peso del bebe");
        peso=lector.nextDouble();
        System.out.println("ingrese cuantos meses tiene el bebe");
        mesesBb=lector.nextDouble();
        System.out.println("ingrese el nombre de la vacuna que le aplicara al bebe");
        nomVacuna=lector.next();
  
        cantidadDosis=((peso+10)/(mesesBb*10)*8);
        System.out.println("Mama"+nombreMm);
        System.out.println("Se le aplicara la vacuna"+nomVacuna);
        System.out.println("con una dosis de:"+cantidadDosis);
        System.out.println("Al paciente"+nombreBb);
        System.out.println("que pesa"+peso+"kilogramos");
        System.out.println("que tiene"+mesesBb+"meses de edad");
    lector.close();
    }
}
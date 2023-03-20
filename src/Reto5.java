import java.util.Scanner;

public class Reto5{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);


        String nombre,  nombreCli,numEmpleado;
        String user, password;
        int  regis;
        float totalCompra = 0, k = 0, productos = 0, pagar, total;


        System.out.println("Ingrese su nombre ");
        nombre=lector.nextLine();
        System.out.println("Ingrese el nombre del cliente");
        nombreCli=lector.nextLine();
        System.out.println("Ingrese el numero del empleado");
        numEmpleado=lector.nextLine();

        System.out.println("Usted ya se escuentra registrado? Responda  1 si si o  2 si no");
        regis=lector.nextInt();
        switch (regis) {
            case 1:
            System.out.println("Ingrese cuantos productos va a comprar");
            k=lector.nextFloat();
            for(int i = 0; i<k; i++){
                System.out.println("Ingrese el precio del producto " +i);
                productos=lector.nextFloat();
                totalCompra=totalCompra+productos;
            }
            System.out.println("El total de su compra fue: "+totalCompra);
            System.out.println("Ingrese con cuanto va a pagar");
            pagar=lector.nextFloat();
              if (pagar<totalCompra){
                System.out.print("No le alcanza");
            }
             else {
                total=pagar-totalCompra;
                System.out.print("Si le acanza, sus vueltas son:  "+total);
            }
            break;
            case 2:
            System.out.println("Bienvenido al formulario de registro");
            System.out.println("Ingrese su nombre de usuario");
            user=lector.next();
            System.out.println("Ingrese su contraseña");
            password=lector.next();
            System.out.println("Usted ya se encuentra registrado!!. Ya puede realizar su compra");
            System.out.println("Digite 1 para realizarla, Digite 2 para salir  ");
            regis=lector.nextInt();
            if (regis==1){
                System.out.println("Ingrese cuantos productos va a comprar");
                k=lector.nextFloat();
                for(int i = 0; i<k; i++){
                    System.out.println("Ingrese el precio del producto " +i);
                    productos=lector.nextFloat();
                    totalCompra=totalCompra+productos;
    
                }System.out.println("El total de su compra fue: "+totalCompra);
                System.out.println("Ingrese con cuanto va a pagar");
                pagar=lector.nextFloat();
                  if (pagar<totalCompra){
                    System.out.print("No le alcanza");
                } else {
                    total=pagar-totalCompra;
                    System.out.print("Si le acanza, sus vueltas son:  "+total);
                }
            }
            else {
                System.out.print("Usted ha salido del sistema");

            }
        }
    lector.close();
    }
}
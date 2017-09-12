/**
 * Implementación de la clase Reloj para probarla.
 * 
 * @author Lida Heliana Arenas Mogollón
 * @version 24-08-2017
 */
import java.util.Scanner;

public class PruebaReloj{
    //atributos de la clase
    Reloj r;
    Scanner teclado;

    //metodo principal
    public static void main(String[] args){
        PruebaReloj p = new PruebaReloj();
    }

    //Constructor de la clase
    public PruebaReloj(){
        teclado = new Scanner(System.in);
        r = new Reloj(); //se inicializa la instancia del la clase Reloj

        int opcion = 0;
        int valor;
        while(opcion != 6){
            System.out.println("\n##########");
            System.out.print(" " + r.obtenerHora() + ":");
            System.out.print(r.obtenerMinutos() + ":");
            System.out.println(r.obtenerSegundos());
            System.out.println("##########");
            System.out.println("\nMenú de opciones:");
            System.out.println("1) Cambiar hora");
            System.out.println("2) Cambiar minutos");
            System.out.println("3) Cambiar segundos");
            System.out.println("4) Aumentar un segundo");
            System.out.println("5) Disminuir un segundo");
            System.out.println("\n6) Salir");
            System.out.print("\nDigite su opción: ");

            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Cambiando hora.");
                    valor = -1;
                    while(!r.cambiarHora(valor)){
                        System.out.print("Ingrese un valor entre 0 y 23: ");
                        valor = teclado.nextInt();
                    }
                    break;
                case 2:
                    valor = -1;
                    while(!r.cambiarMinutos(valor)){
                        System.out.print("Ingrese un valor entre 0 y 59: ");
                        valor = teclado.nextInt();
                    }
                    break;
                case 3:
                    valor = -1;
                    while(!r.cambiarSegundos(valor)){
                        System.out.print("Ingrese un valor entre 0 y 59: ");
                        valor = teclado.nextInt();
                    }
                    break;
                case 4:
                    r.avanzaSegundo();
                    break;
                case 5:
                    r.retrocedeSegundo();
                    break;
            }
        }
    }
}
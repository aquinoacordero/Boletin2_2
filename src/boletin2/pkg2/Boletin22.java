package boletin2.pkg2;
import java.util.Scanner; //se importa la libreria de introduccion de datos

public class Boletin22 {
    
    public static void main(String[] args) {
    //introducir datos por teclado
        float base, altura;
        Scanner dato=new Scanner(System.in); //creamos el dsto que permite introducir valores por pantalla
        System.out.print("introduce base: ");
        base=dato.nextInt();
        System.out.print("introduce altura: ");
        altura=dato.nextInt();
        System.out.println("El resultado es: " +base*altura);
    }
}
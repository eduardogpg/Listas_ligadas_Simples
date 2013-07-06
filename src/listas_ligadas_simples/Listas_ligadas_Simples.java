
package listas_ligadas_simples;

/**
 *
 * @author Eduardo Garcia
 */
import java.util.Scanner;

public class Listas_ligadas_Simples {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int dato;
        IntSLList lista = new IntSLList();
        System.out.println("Introdcue 5 datos a la cola");
        dato = entrada.nextInt();
        lista.addToHead(dato);
        dato = entrada.nextInt();
        lista.addToHead(dato);
        dato = entrada.nextInt();
        lista.addToHead(dato);
        dato = entrada.nextInt();
        lista.addToHead(dato);
        dato = entrada.nextInt();
        lista.addToHead(dato);
        
        lista.printAll();
        
        
        
    }
}

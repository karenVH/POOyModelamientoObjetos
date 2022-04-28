
/**
 * @author Karen Vásquez Hernandez
 * 
 * Clase principal que muestra los numeros aleatorios digitados por el usuario que son reales
 */
public class Main {
    public static void main(String[] args) throws Exception {
        //numeros aleatorios
        System.out.println("Numeros Aleatorios");

        //crear array y ponerle tamaño
        int numeros[] = new int[10];
        //Recorrer el array con un ciclo
        for(int x = 0; x< 10; x++){
            //llenar lo que haya en x en el array numero y la funcion de Math para generar numeros aleatorios
            numeros[x] = (int) (Math.random() * 20);
            //imprimir.
            System.out.println(numeros[x]);
        }
    }
}

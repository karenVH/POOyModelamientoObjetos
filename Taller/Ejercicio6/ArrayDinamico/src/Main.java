
import java.util.Arrays;
import java.util.Scanner;

/**
 * Una interesante clase predefinida en el lenguaje java es la clase Vector,
 *  que implemente la abstracción "array dinámico". Revise la clase y úsela 
 * (en ficheros diferentes) para realizar un programa que lea números del teclado
 *  hasta que se introduce dos veces seguidas el mismo número. Entonces el programa 
 * muestra todos los números introducidos y termina.
 * 
 * 
 * 
 * @author Karen Vásquez Hernandez
 */


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entry = new Scanner(System.in);
        // declaro el vector que va a guardar los numeros reales
        Array<Double> arry=new Arrays<>();
        
        double numbertoAdd;
        int out=1;
        try {
            System.out.print("ingrese un numero entero para agregar a el vector: ");
            numbertoAdd = entry.nextDouble();

        } catch (entryMismatchException e) {
            System.out.println("error ingresaste un caracter ");
            entry.next();
            arry.add(0d);
        }
        
        //bucle que solo finaliiza si el valor a ingresar es el mismo que el ultimo elemento del arrreglo 
        while(out!=0) {
            try{
                System.out.print("ingrese un numero entero para agregar a el vector: ");
                numbertoAdd=entry.nextDouble();
                if(Double.compare(numbertoAdd,arry.lastElement())==0){
                    System.out.println("ingresaste un numero repetido");
                    out=0;
                    break;
                }
                arry.add(numbertoAdd);
            } catch (Exception e){
                System.out.println("ingresaste una cadena, debes ingresar un numero real: ");
                entry.next();
                arry.add(0d);
            }         

        }
        //muestra todos los elementos del array
        System.out.println(" estos son los numero que hay en el arry ");
        for (int i = 0; i < arry.size(); i++) {
            System.out.println(arry.elementAt(i));
        }          
    }
    }


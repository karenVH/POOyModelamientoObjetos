/**
 * importaciones
 */
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
      ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

      /**
       * intanciar la clase Scanner para leer datos
       */
      Scanner entry1 = new Scanner(System.in);
      Scanner entry2 = new Scanner(System.in);

      System.out.println("---Crea Tu vehiculo---");
      //Ciclo que crea 10 vehiculos
        for(int i = 0; i<= 10; i++){
        Vehicle vehicle;
        System.out.println("¿Tu vehiculo tiene tripulacion?");
        boolean crew = entry1.nextBoolean();
        System.out.println("Digite numero de pasajeros");
        int numberPassengers = entry1.nextInt();
        System.out.println("Digite numero de ruedas del vehiculo");
        int numberWheels = entry1.nextInt();
        System.out.println("Digite año de matricula del vehiculo dd/MM/YY");
        //la variable fecha es tipo string para poderla comvertir en fecha por medio de un objeto de date
        String fecha = entry1.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateEnrollment= sdf.parse(fecha);
        entry1.nextLine();
        System.out.println("Digite medio por el que se desplaza");
        String displacement = entry2.nextLine();
        
       vehicle = new Vehicle(numberPassengers, crew, numberWheels,dateEnrollment, displacement);
       vehicles.add(vehicle);

    }
    /**
     * Mostrar los 10 vehiculos
     */
    for(Vehicle vehicle : vehicles){
        int i =1;
        System.out.println("\n Este es el vehiculo numero " + i);
        i++;
        System.out.println("El vehiculo tiene " + vehicle.numberWheels + " ruedas ");
        System.out.println("Su desplazamiento es por " + vehicle.displacement);
        System.out.println("Necesita de tripulacion " + vehicle.crew);
        System.out.println("La fecha de matricula del vehiculo es: " + vehicle.dateEnrollment);
    }
    }
}

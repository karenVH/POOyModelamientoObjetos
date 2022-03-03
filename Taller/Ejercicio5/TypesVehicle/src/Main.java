import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Principal
 * 
 * @author Karen Vásquez Hernandez
 */

public class Main {
    public static <Date> void main(String[] args) throws Exception {
        /**
         * A partir de la clase anterior, y mediante herencia cree nuevas clases que
         * permitan diferenciar si el objeto es un coche, una moto, un camión,
         * una bicicleta, una lancha.Incluya en cada clase algún atributo específico
         * que la diferencie de las demás. Por ejemplo, para el coche un booleano
         * que determine si es de tres o cinco puertas, para el camión la altura
         * (indiferente en los otros vehículos), etc. Realice un programa como el del
         * ejercicio anterior
         * capaz de trabajar con los distintos tipos de vehículos.
         */
        // definir array para llenar las clases de tipos d evehiculo
        ArrayList<Truck> truck = new ArrayList<Truck>();
        ArrayList<Bike> bikes = new ArrayList<Bike>();
        ArrayList<Car> car = new ArrayList<Car>();
        ArrayList<Boat> boat = new ArrayList<Boat>();

        Scanner entry1 = new Scanner(System.in);
        Scanner entry2 = new Scanner(System.in);

        // creacion de vehiculo
        for (int i = 0; i < 10; i++) {
            Vehicle vehicle;

            System.out.println("digite capacidad de pasajeros que tiene el vehiculo");
            int numberPassengers = entry1.nextInt();

            System.out.println("Digita numero de ruedas");
            int numberWheels = entry1.nextInt();

            System.out.println("Digita falso o verdadero si el vehiculo neceista de tripulacion");
            boolean crew = entry1.nextBoolean();

            System.out.println("Digitar fecha de matricula de vehiculo");
            String fecha = entry1.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dateEnrollment = sdf.parse(fecha);

            System.out.println("Digite medio por el que se desplaza");
            String displacement = entry2.nextLine();
        }

        System.out.println("-----Opciones----");
        System.out.println("ingresa 1 para crear una bicicleta\n"
                + "ingresa 2 para crear un Carro\n"
                + "ingresa 3 para crear un Camion \n"
                + "ingresa 4 para crer un Barco \n");
        int option = entry1.nextInt();
        //--
        switch (option) {
            case 1:
                Bike bike = new Bike(numberPassengers, crew, numberWheels, dateEnrollment, displacement,
                        createBike());
                bikes.add(bike);
                break;
            case 2:
                Car car = new Car(numberPassengers, crew, numberWheels, dateEnrollment, displacement,
                        createCar());
                cars.add(car);
                break;
            case 3:
                Truck truck = new Truck(numberPassengers, crew, numberWheels, dateEnrollment, displacement,
                        createTruck());
                trucks.add(truck);
                break;
            case 4:
                Boat boat = new Boat(numberPassengers, crew, numberWheels, dateEnrollment, displacement,
                        createBoat());
                boats.add(boat);
                break;
            default:
                break;
        }

        public static String createBike() {
            Scanner entry2=new Scanner(System.in);
            System.out.println("digite la talla de la bicicleta");
            String bikeSize = entry2.nextDouble();
            return bikeSize;
        }

        public static int createCar() {
            Scanner entry2=new Scanner(System.in);
            System.out.println("Digite el modelo del carro");
            String carModel = entry2.nextLine();
            System.out.println("ingrese el nuemro de puertas: ");
            int numDoors = entry2.nextInt();
            return numDoors;
        }
        public static double createTruck() {
            Scanner entry2=new Scanner(System.in);
            System.out.println("ingrese la altura del camion: ");
            double truckHeight = entry2.nextDouble();
            return truckHeight;
        }
        public static String createBoat() {
            Scanner entry2=new Scanner(System.in);
            System.out.println("ingrese el tipo de helice que usa el barco: ");
            String propellerBoat = entry2.nextLine();
            return propellerBoat;
        }
    }

}

import java.sql.Date;
import java.util.Calendar;
/**
 * Clase que modela los objetos del vehiculo
 * @author Karen Vásquez Hernandez
 */

public class Vehicle{
     // Incluya aspectos comunes a todos los vehículos como número de pasajeros, presencia o ausencia de tripulación, 
    //número de ruedas, fecha de matriculación,medio por el que se desplaza, etc. Incluya los métodos que considere 
    //oportunos.Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a continuación por pantalla.
    /**Numero de pasajeros del vehiculo */
    //variables principales de la clase
    // variable que contiene la cantidad de pasajeros permitidos en el vehiculo
    protected  int numberPassengers;
    //variable tipo booleana para saber si hay o no tripulacion
    protected  boolean crew;
    //variable para el numero de ruedas del vehiculo
    protected int numberWheels;
    //variable para el año de la matricula del vehiculo
    protected Date dateEnrollment;
    //variable que contiene el medio de desplazamiento del vehiculo
    protected String displacement;

    
    /**
     * Constructor  principal
     * @param numberPassengers Numero de pasajeros
     * @param crew tripulacion
     * @param numberWheels numero de ruedas
     * @param dateEnrollment fecha de la matriucla del vehiculo
     * @param displacement desplazamiento del vehiculo
     */
    public Vehicle(int numberPassengers, boolean crew, int numberWheels, Date dateEnrollment, String displacement) {
        this.numberPassengers = numberPassengers;
        this.crew = crew;
        this.numberWheels = numberWheels;
        this.dateEnrollment = dateEnrollment;
        this.displacement = displacement;
    }
    
    /**
     * Constructor 2
     * @param numberPassengers
     * @param crew
     * @param numberWheels
     * @param displacement
     */
    public Vehicle(int numberPassengers, boolean crew, int numberWheels, String displacement) {
        this.numberPassengers = numberPassengers;
        this.crew = crew;
        this.numberWheels = numberWheels;
        this.displacement = displacement;
    }





    //Getters and Setters
    /**
     * Metodo para obtener el numero de pasajeros
     * @return numero de pasajeros
     */
    public int getNumberPassengers() {
        return numberPassengers;
    }

    /**
     * Metodo para mostrar el numero de pasajeros
     * @param numberPassengers
     */
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    /**
     * Metodo para obtener la tripulacion
     * @return tripulacion
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * Metodo para mostrar si hay o no tripulacion
     * @param crew tripulacion
     */
    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    /**
     * Metodo para obtener el numero de ruedas
     * @return numero de ruedas
     */
    public int getNumberWheels() {
        return numberWheels;
    }

    /**
     * Metodo para mostrar el numero de ruedas
     * @param numberWheels
     */
    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    /**
     * Metodos para obtener el año de la matricula
     * @return devuelve año matricula
     */
    public Date getYearEnrollment() {
        return dateEnrollment;
    }

    /**
     * Metodo para mostrar el año de la matricula
     * @param yearEnrollment
     */
    public void setDateEnrollment() {
        this.dateEnrollment = dateEnrollment;
    }

    /**
     * Metodo para obtener el desplazamiento del vehiculo
     * @return medio de desplazamiento del vehiculo
     */
    public String getDisplacement() {
        return displacement;
    }

    /**
     * Metodo para mostrar el medio de desplazamiento
     * @param displacement
     */
    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    
    
}
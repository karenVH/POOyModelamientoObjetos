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
     * @param numberPassengers
     * @param crew
     * @param numberWheels
     * @param dateEnrollment
     * @param displacement
     */
    public Vehicle(int numberPassengers, boolean crew, int numberWheels, Date dateEnrollment, String displacement) {
        this.numberPassengers = numberPassengers;
        this.crew = crew;
        this.numberWheels = numberWheels;
        this.dateEnrollment = dateEnrollment;
        this.displacement = displacement;
    }
    
    /**
     * Constructor 
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





    //GETS Y SETS
    /**
     * get
     * @return numero de pasajeros
     */
    public int getNumberPassengers() {
        return numberPassengers;
    }

    /**
     * set
     * @param numberPassengers
     */
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    /**
     * get
     * @return si hay o no tripulacion
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * set
     * @param crew
     */
    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    /**
     * get
     * @return numero de ruedas
     */
    public int getNumberWheels() {
        return numberWheels;
    }

    /**
     * set
     * @param numberWheels
     */
    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    /**
     * get
     * @return devuelve año matricula
     */
    public Date getYearEnrollment() {
        return dateEnrollment;
    }

    /**
     * set
     * @param yearEnrollment
     */
    public void setDateEnrollment() {
        this.dateEnrollment = dateEnrollment;
    }

    /**
     * get
     * @return medio de desplazamiento del vehiculo
     */
    public String getDisplacement() {
        return displacement;
    }

    /**
     * set
     * @param displacement
     */
    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    
    
}
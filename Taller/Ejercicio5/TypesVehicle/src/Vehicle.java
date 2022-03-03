import java.sql.Date;

public class Vehicle {
    //Variables
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
     * Cnstructor
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
     * @return tripulacion
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
     * @return numero de llantas
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
     * @return fecha de matricula
     */
    public Date getDateEnrollment() {
        return dateEnrollment;
    }

    /**
     * set
     * @param dateEnrollment
     */
    public void setDateEnrollment(Date dateEnrollment) {
        this.dateEnrollment = dateEnrollment;
    }

    /**
     * get
     * @return medio por el que se desplaza
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

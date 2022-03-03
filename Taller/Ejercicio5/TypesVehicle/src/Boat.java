import java.sql.Date;

public class Boat extends Vehicle {
     //helice que usa el barco
     private String propellerBoat;

     /**
      * Constructor
      * @param numberPassengers
      * @param crew
      * @param numberWheels
      * @param dateEnrollment
      * @param displacement
      */
    public Boat(int numberPassengers, boolean crew, int numberWheels, Date dateEnrollment, String displacement, String propellerBoat) {
        super(numberPassengers, crew, numberWheels, dateEnrollment, displacement);
        this.propellerBoat = propellerBoat;
    }

    /**
     * get
     * @return helice del barco
     */
    public String getPropellerBoat() {
        return propellerBoat;
    }

    /**
     * set
     * @param propellerBoat
     */
    public void setPropellerBoat(String propellerBoat) {
        this.propellerBoat = propellerBoat;
    }

   


}

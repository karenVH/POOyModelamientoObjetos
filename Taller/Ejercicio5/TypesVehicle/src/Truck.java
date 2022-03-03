import java.sql.Date;

public class Truck extends Vehicle{
    //Altura de la altura del camion
    private double truckHeight;


    /**
     * Constructor 
     * @param numberPassengers
     * @param crew
     * @param numberWheels
     * @param dateEnrollment
     * @param displacement
     */

    public Truck(int numberPassengers, boolean crew, int numberWheels, Date dateEnrollment, String displacement, double truckHeight) {
        super(numberPassengers, crew, numberWheels, dateEnrollment, displacement);
        this.truckHeight = truckHeight;
        //TODO Auto-generated constructor stub
    }


    /**
     * get 
     * @return Altura del camion
     */
    public double getTruckHeight() {
        return truckHeight;
    }

    /**
     * set
     * @param truckHeight
     */
    public void setTruckHeight(double truckHeight) {
        this.truckHeight = truckHeight;
    }

    
    
}

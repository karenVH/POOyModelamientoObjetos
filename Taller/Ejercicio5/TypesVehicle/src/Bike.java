import java.sql.Date;

public class Bike extends Vehicle {
    //Variable de la clase
    //talla de la bicileta
    private double bikesize;

    /**
     * Constructor
     * @param numberPassengers
     * @param crew
     * @param numberWheels
     * @param dateEnrollment
     * @param displacement
     */
    public Bike(int numberPassengers, boolean crew, int numberWheels, Date dateEnrollment, String displacement, double bikesize) {
        super(numberPassengers, crew, numberWheels, dateEnrollment, displacement);
        this.bikesize = bikesize;
    }

    /**
     *  get
     * @return talla de la bicleta
     */
    public double getBikesize() {
        return bikesize;
    }

    /**
     * set
     * @param bikesize
     */
    public void setBikesize(double bikesize) {
        this.bikesize = bikesize;
    }
    

    
}

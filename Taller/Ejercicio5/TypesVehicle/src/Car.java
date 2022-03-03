import java.sql.Date;

/**
 * @autor Karen Vásquez Hernández
 */
public class Car extends Vehicle {
    /**
     * Numero de puertas del carro
     */
    private int numDoors;
    // modelo del carro
    private String carModel;

    /**
     * 
     * @param numberPassengers
     * @param crew
     * @param numberWheels
     * @param dateEnrollment
     * @param displacement
     * @param numDoors
     * @param carModel
     */
    public Car(int numberPassengers, boolean crew, int numberWheels, Date dateEnrollment, String displacement,
            int numDoors, String carModel) {
        super(numberPassengers, crew, numberWheels, dateEnrollment, displacement);
        this.numDoors = numDoors;
        this.carModel = carModel;
    }

    /**
     * get
     * @return numero de puertas
     */
    public int getNumDoors() {
        return numDoors;
    }

    /**
     * set
     * @param numDoors
     */
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    /**
     * get
     * @return modelo del carro
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * set
     * @param carModel
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    

}

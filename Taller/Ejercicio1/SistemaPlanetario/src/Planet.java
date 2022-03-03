import java.util.UUID;

public class Planet {
    //Atributos principales de la clase planet
    public static final double sunDistance2 = 0;
    public static String name;
    public static double planetMass;
    public static double density;
    public static double diameter;
    public static double sunDistance;
    public UUID identifier;

    //get y sets/
    public static double getSundistance2() {
        return sunDistance2;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPlanetMass() {
        return planetMass;
    }
    
    public void setPlanetMass(double planetMass) {
        this.planetMass = planetMass;
    }
    
    public double getDensity() {
        return density;
    }
    
    public void setDensity(double density) {
        this.density = density;
    }
    
    public double getDiameter() {
        return diameter;
    }
    
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    public double getSunDistance() {
        return sunDistance;
    }
    
    public void setSunDistance(double sunDistance) {
        this.sunDistance = sunDistance;
    }
    
    public UUID getIdentifier() {
        return identifier;
    }
    
    public void setIdentifier(UUID identifier) { 
        
    this.identifier = identifier;
}

    /**
     * Connstructor para inicializar atributos.
     * @param name
     * @param planetMass
     * @param density
     * @param diameter
     * @param sunDistance
     * @param identifier
     */
    public Planet(String name, double planetMass, double density, double diameter, double sunDistance, UUID identifier) {
        this.name = name;
        this.planetMass = planetMass;
        this.density = density;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
        this.identifier = UUID.randomUUID();
    }

    /**
     * Constructor con
     * @param planetMass
     * @param sunDistance
     */
    public Planet(double planetMass, double sunDistance) {
        this.planetMass = planetMass;
        this.sunDistance = sunDistance;
    }

    //**Funcion para calcular la distancia entre planetas */
    public double ForceAtractionPlanet(double planetMass1, double planetMass2, double sunDistance1, double sunDistance2){
        final double constantGravity = 6.673*Math.pow(10, -11); //G=6.67380* 10^-11
        double planetDistance = sunDistance1 -sunDistance2; //Se calcula la distancia entre dos planetas

        if(planetDistance<0){
            planetDistance*=(-1);
        }

        //F = G *(M1*M2)/DISTANCIA^2
        double ForceAtraction = constantGravity *((planetMass1 * planetMass2)/Math.pow(planetDistance, 2));
        System.out.println("la fuerza de atraccion de estos dos cuerpos es: " + ForceAtraction);

        return ForceAtraction;
    }

/**
 * Metodo para calcular la fuerza de atraccion usando los siguientes parametros.
 * @param planetMass
 * @param sunMass
 * @param sunDistance
 * @return
 */
    public double ForceAtractionSun(double planetMass, double sunMass, double sunDistance){
        final double constantGravity = 6.673*Math.pow(10, -11); //G=6.67380* 10^-11
        double force = constantGravity * ((planetMass*sunMass)/Math.pow(sunDistance, 2));
        System.out.println("La fuerza de atracción es: " + force);
        return force;
    }



    
    
}

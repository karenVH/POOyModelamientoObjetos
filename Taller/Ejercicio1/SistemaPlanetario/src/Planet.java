import java.util.UUID;

/**
 * @author Karen Vásquez Hernández
 * 
 * Clase que modela planetas
 */
public class Planet {
    //Atributos principales de la clase planet
    public static final double sunDistance2 = 0; 
    public static String name; 
    public static double planetMass; 
    public static double density;
    public static double diameter; 
    public static double sunDistance; 
    public UUID identifier;

    // Getters y Setters
    /**
     * Metodo para Obtener la distancia del sol
     * @return distancia del sol1 
     */
    public static double getSundistance2() {
        return sunDistance2;
    }
    
    /**
     * Metodo para obtener el nombre del planeta
     * @return nombre del planeta
     */
    public String getName() {
        return name;
    }
    
    /**
     * Metodo para mostrar el nombre del planeta
     * @param name nombre del planeta
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Metodo para obtener la masa del planeta
     * @return masa del planeta
     */
    public double getPlanetMass() {
        return planetMass;
    }
    
    /**
     * Metodo para mostrar las masa ddel planeta
     * @param planetMass Masa del planeta
     */
    public void setPlanetMass(double planetMass) {
        this.planetMass = planetMass;
    }
    
    /**
     * Metodo para obtener la densidad del planeta
     * @return densidad del planeta
     */
    public double getDensity() {
        return density;
    }
    
    /**
     * Metodo para mostrar la densidad del planeta
     * @param density densidad del planeta
     */
    public void setDensity(double density) {
        this.density = density;
    }
    
    /**
     * Metodo para obtener el diametro del planeta
     * @return diametro del planeta
     */
    public double getDiameter() {
        return diameter;
    }
    
    /**
     * Metodo para mostrar el diametro del planeta
     * @param diameter diametro del planeta
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    /**
     * Metodo para obtener la distancia del sol
     * @return distancia del sol
     */
    public double getSunDistance() {
        return sunDistance;
    }
    
    /**
     * Metodo para mostrar la distancia del sol
     * @param sunDistance distancia al sol
     */
    public void setSunDistance(double sunDistance) {
        this.sunDistance = sunDistance;
    }
    
    /**
     * Metodo para obtener el identificador unico
     * @return identificador unico
     */
    public UUID getIdentifier() {
        return identifier;
    }
    
    /**
     * Metodo para mostrar el identificador unico
     * @param identifier
     */
    public void setIdentifier(UUID identifier) { 
        
    this.identifier = identifier;
}

    /**
     * Connstructor para inicializar atributos.
     * @param name nombre del planeta
     * @param planetMass masa del planeta
     * @param density densidad del planeta
     * @param diameter diametro del planeta
     * @param sunDistance distancia al sol
     * @param identifier identificador unico
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
     * Constructor para una funcion
     * @param planetMass masa del planeta
     * @param sunDistance distancia del sol
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

import java.util.UUID;

public class Sun {
    public String name;
    public double sunMass;
    public double density;
    public double diameter;
    public UUID identifier;


    public Sun(String name, double sunMass, double density, double diameter, UUID identifier) {
        this.name = name;
        this.sunMass = sunMass;
        this.density = density;
        this.diameter = diameter;
        this.identifier = UUID.randomUUID();
    }


    public Sun(double sunMass) {
        this.sunMass = sunMass;
    }
}

    
    
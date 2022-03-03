import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planet planeta1 = new Planet(5.972*Math.pow(10,24), 1.496*Math.pow(10, 11));
        Planet planeta2 = new Planet(1.898*Math.pow(10,27), 2.496*Math.pow(10, 11));
        Sun sol = new Sun(1.989 *Math.pow(10, 30));

        planeta1.ForceAtractionSun(planeta1.planetMass, sol.sunMass, planeta1.sunDistance);

        planeta1.ForceAtractionPlanet(planeta1.planetMass, planeta2.planetMass, planeta1.sunDistance, planeta2.sunDistance);

        
        Scanner entrada = new Scanner(System.in);
        System.out.println("----Creación de planetas----");
        System.out.println("Digita el nombre del Planeta");
        Planet.name = entrada.nextLine();
        System.out.println("Masa del Planeta");
        Planet.planetMass = entrada.nextDouble();
        System.out.println("Digita densidad del planeta");
        Planet.density = entrada.nextDouble();
        System.out.println("Digita diametro del planeta");
        Planet.diameter = entrada.nextDouble();
        System.out.println("Digita la distancia al sol");
        Planet.sunDistance = entrada.nextDouble();

        System.out.println(Planet.name + Planet.planetMass + Planet.density + Planet.diameter + Planet.sunDistance);
    
    }
}

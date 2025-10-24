public class Sphere {
    private double radius;
    
    // Constructor
    public Sphere(double r) {
        this.radius = r;
    }
    
    // Calculate volume
    // Formula: V = (4/3) * π * r³
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    public double getRadius() {
        return radius;
    }
}
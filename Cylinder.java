public class Cylinder {
    private double radius;
    private double height;
    
    // Constructor
    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }
    
    // Calculate volume
    // Formula: V = π * r² * h
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getHeight() {
        return height;
    }
}
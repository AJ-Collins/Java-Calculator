public class Cube {
    private double side;
    
    // Constructor
    public Cube(double s) {
        this.side = s;
    }
    
    // Calculate volume
    // Formula: V = s³
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
    
    public double getSide() {
        return side;
    }
}
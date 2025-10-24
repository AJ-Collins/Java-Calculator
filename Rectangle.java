public class Rectangle {
    // Properties
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
}
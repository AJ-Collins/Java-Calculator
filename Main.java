/**
 * Program: Area and Volume Calculator
 * Purpose: This program calculates the area of rectangles and
 * volumes of various 3D shapes (sphere, cylinder, cube)
 * using object-oriented programming principles.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("**************************************");
        System.out.println("*** AREA AND VOLUME CALCULATOR ***");
        System.out.println("**************************************\n");
        
        try {
            while (running) {
                // Main menu
                System.out.println("\n=== MAIN MENU ===");
                System.out.println("1. Calculate Rectangle Area");
                System.out.println("2. Calculate Sphere Volume");
                System.out.println("3. Calculate Cylinder Volume");
                System.out.println("4. Calculate Cube Volume");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                
                if (!sc.hasNextInt()) {
                    System.out.println("Error: Please enter a valid choice");
                    sc.next();
                    continue;
                }
                
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        calculateRectangleArea(sc);
                        break;
                    case 2:
                        calculateSphereVolume(sc);
                        break;
                    case 3:
                        calculateCylinderVolume(sc);
                        break;
                    case 4:
                        calculateCubeVolume(sc);
                        break;
                    case 5:
                        System.out.println("\nThank you for using the Area and Volume Calculator!");
                        System.out.println("Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    
    // Method to calculate rectangle area
    public static void calculateRectangleArea(Scanner sc) {
        System.out.println("\n=== Rectangle Area Calculator ===");
        System.out.print("Enter length: ");
        
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input");
            sc.next();
            return;
        }
        double length = sc.nextDouble();
        
        System.out.print("Enter width: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input");
            sc.next();
            return;
        }
        double width = sc.nextDouble();
        
        if (length <= 0 || width <= 0) {
            System.out.println("Error: Dimensions must be positive");
            return;
        }
        
        Rectangle rect = new Rectangle(length, width);
        System.out.println("\nResult: Rectangle Area = " + rect.calculateArea() + " square units");
    }
    
    // Method to calculate sphere volume
    public static void calculateSphereVolume(Scanner sc) {
        System.out.println("\n=== Sphere Volume Calculator ===");
        System.out.print("Enter radius of sphere: ");
        
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input");
            sc.next();
            return;
        }
        double radius = sc.nextDouble();
        
        if (radius <= 0) {
            System.out.println("Error: Radius must be positive");
            return;
        }
        
        Sphere sphere = new Sphere(radius);
        System.out.printf("\nResult: Sphere Volume = %.2f cubic units\n", sphere.calculateVolume());
    }
    
    // Method to calculate cylinder volume
    public static void calculateCylinderVolume(Scanner sc) {
        System.out.println("\n=== Cylinder Volume Calculator ===");
        System.out.print("Enter radius of cylinder: ");
        
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input");
            sc.next();
            return;
        }
        double radius = sc.nextDouble();
        
        System.out.print("Enter height of cylinder: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input");
            sc.next();
            return;
        }
        double height = sc.nextDouble();
        
        if (radius <= 0 || height <= 0) {
            System.out.println("Error: Dimensions must be positive");
            return;
        }
        
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.printf("\nResult: Cylinder Volume = %.2f cubic units\n", cylinder.calculateVolume());
    }
    
    // Method to calculate cube volume
    public static void calculateCubeVolume(Scanner sc) {
        System.out.println("\n=== Cube Volume Calculator ===");
        System.out.print("Enter side length of cube: ");
        
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input");
            sc.next();
            return;
        }
        double side = sc.nextDouble();
        
        if (side <= 0) {
            System.out.println("Error: Side length must be positive");
            return;
        }
        
        Cube cube = new Cube(side);
        System.out.printf("\nResult: Cube Volume = %.2f cubic units\n", cube.calculateVolume());
    }
}
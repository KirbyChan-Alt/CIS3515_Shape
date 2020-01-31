
package com.mycompany.shape;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;
    
    public Triangle (String name) {
        super(name);
    }
    
    public void setDimensions(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /** returns the area of the shape */
    @Override
    public double getArea() {
        return 0.0;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("No Dimensions");
    }
}

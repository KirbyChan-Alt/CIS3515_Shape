
package com.mycompany.shape;

public class Circle extends Shape{

    private double radius;
    
    public Circle (String name) {
        super(name);
    }
    
    public void setDimensions(double radius) {
        this.radius = radius;
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

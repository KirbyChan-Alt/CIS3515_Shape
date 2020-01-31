
package com.mycompany.shape;

public class Square extends Shape {
    
    private double length;
    private double height;
    
    public Square (String name) {
        super(name);
    }
    
    public void setDimensions(double length, double height) {
        this.length = length;
        this.height = height;
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

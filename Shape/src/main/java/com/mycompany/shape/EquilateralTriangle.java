
package com.mycompany.shape;

public class EquilateralTriangle extends Triangle {

    private double side;
    
    public EquilateralTriangle (String name) {
        super(name);
    }
    
    public void setDimensions(double side) {
        this.side = side;
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

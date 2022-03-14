package PPsphere;

import java.text.DecimalFormat;


public class Sphere {
    private double diameter;

    public Sphere(double diameter) { // constructor
        // to set up this spehere object with the specified diameter
        this.diameter = diameter;
    }

    public void setDiameter(double diameterupdate) {
        // Sets this sphere's diameter
        this.diameter = diameterupdate;
    }

    public double getDiameter() {
        // returns this sphere's diameter
        return diameter;
    }
    
    public double volume()
            //computes and returns the volume of this sphere
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(diameter/2, 3);
    }
    
    public double area()
    {
      return 4 * Math.PI * Math.pow(diameter/2, 2);
    }
    
    public String toString() 
    {
    DecimalFormat dfmt = new DecimalFormat("0.###");    
    return "Sphere Diameter: " + diameter + "\t Volume: "
            + dfmt.format(volume()) + "\t Area: " +dfmt.format(area());
    }
    
    
    
    
    
    
}

package labfinalexam.Question1;

public class Cylinder extends Shape{
    private double height;
    private double radius;

    public Cylinder(String name,double height,double radius){
        super(name);
        setHeight(height);
        setRadius(radius);
    }

    public Cylinder(String name, String color, double height, double radius) {
        super(name,color);
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculatedArea(){
        double s = radius+height;
        return 2*Math.PI*radius*s;
    }
    public void displayDetails(){
        System.out.println("Name of the shape is : " + super.getName());
        System.out.println("Color of the shape is : "+ super.getColor());
        System.out.println("Radius of Circle : " + radius);
        System.out.println("Area of Circle : "+calculatedArea());
    }
}

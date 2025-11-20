package labfinalexam.Question1;

public class Circle extends Shape{
    private double Radius;

    public Circle(String name, double radius){
        super(name);   //radius is required for declaring a circle
        setRadius(radius);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
    }

   final public double calculatedArea(){
        return Radius*Radius*Math.PI;
    }
    public void displayDetails(){
        System.out.println("Name of the shape is : " + super.getName());
        System.out.println("Color of the shape is : "+ super.getColor());
        System.out.println("Radius of Circle : " + Radius);
        System.out.println("Area of Circle : "+calculatedArea());
    }
}

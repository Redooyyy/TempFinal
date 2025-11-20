package labfinalexam.Question1;

  public abstract class Shape {
    private String name;
    private String color;

    Shape(String name){
        setName(name);
    }
    Shape(String n, String c){
        setName(n);
        setColor(c);
    }
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

     abstract void displayDetails();
}

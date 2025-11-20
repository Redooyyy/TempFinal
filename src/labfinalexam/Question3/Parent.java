package labfinalexam.Question3;

public class Parent extends Methods {

    private String job;

    public Parent(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void indroduce(){
        super.indroduce();
        System.out.println("I work as " + job);
    }
    public void activity(){
        System.out.println("I Work");
    }
}

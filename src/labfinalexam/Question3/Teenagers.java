package labfinalexam.Question3;

public class Teenagers extends Methods {
    private String schoolName;
    private String wantTo = "School";
    public Teenagers(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }
    Teenagers(String name, int age,String schoolName,String wantTo) {
        super(name, age);
        this.schoolName = schoolName;
        this.wantTo = wantTo;
    }

    public void setWantTo(String wantTo) {
        this.wantTo = wantTo;
    }

    public String getWantTo() {
        return wantTo;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public void indroduce() {
        super.indroduce();
        System.out.println("I want to go to : "+wantTo);
        System.out.println("My school name is : "+schoolName);
    }
    @Override
    public void activity(){
        System.out.println("I Want to +"+ wantTo);
    }
}

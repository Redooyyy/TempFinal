package labfinalexam.Question3;

public class Methods implements FamilyMembers {
    private String name;
    private int age;
    private String activity;

    public Methods(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void indroduce() {
        System.out.println("My name is : "+name);
        System.out.println("I am "+age+" years old");
    }

    @Override
    public void activity() {
        System.out.println(activity);
    }

}

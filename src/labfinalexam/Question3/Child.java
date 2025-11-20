package labfinalexam.Question3;

public class Child extends Methods {
    private String wantTo = "play";
    private String play;
    public Child(String name, int age) {
        super(name, age);
    }
    public Child(String name, int age,String play) {
        super(name, age);
        this.play = play;
    }
    public String getWantTo() {
        return wantTo;
    }

    public void setWantTo(String wantTo) {
        this.wantTo=wantTo;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    @Override
    public void indroduce() {
        super.indroduce();
        if(play != null) System.out.println("My favorite game is : "+play);
    }
    @Override
    public void activity(){
        System.out.println("I Want to +"+ wantTo);
    }
}

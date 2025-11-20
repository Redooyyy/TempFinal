package labfinalexam.Question2;

public class Book {
    private String name;
    private String year;


public Book(){}
   public Book(String name){
        this.name=name;
    }
   public Book(String name,String year){
       setName(name);
       setYear(year);
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        if(this.name == null) this.name=name;
         else System.out.println("Name can not be change");
    }

    public void setYear(String year) {
        try {
            if(yearException(year)){
                this.year = year;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private boolean yearException(String year){
       if(year == null){
           System.out.println("Please insert a year");
           return false;
       }
       else if(year.length() != 4){
           System.out.println("Invalid year");
           return false;
       }
       return true;
    }

    public void bookInfo(){
        System.out.println("Book name is : "+this.name);
        System.out.println("Book published year : "+this.year);
    }
}

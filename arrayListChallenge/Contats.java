public class Contats {
    private String name;
    private String number;

    public Contats(String name , String number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }

    public Contats addContats(String name , String number){
        return new Contats(name, number);
    }
    
}

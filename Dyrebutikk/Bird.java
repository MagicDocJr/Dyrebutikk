public class Bird extends Animal {
    private int wingspan;
    private String color;
    
    
    public Bird(String species, int price,  String name, int year, int month, int day, int wingspan, String color){
     super(species, price, name, year, month, day);
     this.wingspan = wingspan;   
     this.color = color;   
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nWingspan: " + wingspan + " cm" + "\nColor: " + color + "\n=============";
    }
    
    @Override
    public void printDetails(){
        System.out.println(toString());
    }
}
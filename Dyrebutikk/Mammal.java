public class Mammal extends Animal {
    private int pregnancy;
    private int litterAverage;
    
    
    public Mammal(String species, int price,String name, int year, int month, int day, int pregnancyTime, int numberOfChildren){
     super(species, price, name, year, month, day);
     this.litterAverage = numberOfChildren;   
     pregnancy = pregnancyTime;   
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nLength of pregnancy: " + pregnancy + " months \nAverage litter "  + litterAverage + " kids"        
        + "\n=============";
    }
    
    @Override
    public void printDetails(){
        System.out.println(toString());
    }
}
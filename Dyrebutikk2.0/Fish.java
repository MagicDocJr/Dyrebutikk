public class Fish extends Animal {
    private int temprature;
    private int depth;
    private String waterType;
    
    
    public Fish(String type, String species, int price, String name, int year, int month, int day, int temprature, int depth, String waterType){
     super(type, species, price, name, year, month, day);
     this.temprature = temprature;   
     this.depth = depth;
     this.waterType = waterType;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nWatertype: " + waterType + "\nPreferred temperature: " + temprature + "°C"+ "\nPreferred depth: " + depth + " Meters" + "\n=============";
    }
    
    @Override
    public void printDetails(){
        System.out.println(toString());
    }
}
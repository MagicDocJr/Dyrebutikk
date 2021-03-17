import java.time.LocalDate;

public class Animal{
    private String species;
    private String name;
    private LocalDate birthday;
    private int price;

    public Animal(String species, int price, String name, int year, int month, int day){
        this.species = species;
        this.birthday = birthday.of(year, month, day);
        this.price = price;
        this.name = name;

    }
    
    @Override
    public String toString(){
        return getSpecies() + ": " + getPrice() +
        "$ \nDate of birth: " + getBirthday() ;
    }
    
    public void printDetails(){
     System.out.println(toString());   
    }

    public String getSpecies(){
        return species;   
    }

    public String getBirthday(){
        return birthday.toString();   
    }

    public int getPrice(){
        return price;        
    }

    public void setPrice(int newPrice){
        price = newPrice;
    }
}
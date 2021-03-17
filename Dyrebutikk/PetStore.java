import java.util.ArrayList;

public class PetStore{
    private String name;
    private String adress;
    private ArrayList<Animal> animals;

    public PetStore(String name, String adress){
        this.name = name;
        this.adress = adress;
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animalToAdd){        
        animals.add(animalToAdd);  
    }

    public void listAnimals(){
        if (animals.size() > 0){
            animals.forEach(animal -> System.out.println(animal));
        } else {
            System.out.println("No animals in this shop");
        }
    }

    public void animalsUnderPrice(int priceLimit){
        if (animals.size() > 0){
            animals.stream()
                .filter(animal -> animal.getPrice() <= priceLimit)
                .forEach(animal -> System.out.println(animal));            
        } else {
            System.out.println("No animals in this shop");
        } 
    }
    
    public void searchAnimal(String species){
     animals.stream()
        .filter(animal-> species.contains(animal.getSpecies()))
        .forEach(animal -> System.out.println(animal));
    }
 
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        sortListBySpecies();
    }

    public void listAnimals(){
        ifListEmpty();

        animals.forEach(System.out::println);        
    }   

    public void animalsUnderPrice(int priceLimit){
        ifListEmpty();

        animals.stream()
        .filter(animal -> animal.getPrice() <= priceLimit)
        .forEach(System.out::println);            
    }

    public void searchAnimal(String species){
        ifListEmpty();
        
        animals.stream()
        .filter(animal-> species.contains(animal.getSpecies()))
        .forEach(System.out::println);
    }

    private void sortListBySpecies(){
        Collections.sort(animals, Comparator.comparing(Animal::getType)
            .thenComparing(Animal::getSpecies));        
    }

    private void ifListEmpty(){
        if (animals.size() <= 0) {
            System.out.println("There are no animals in this shop yet");
        }

    }
}
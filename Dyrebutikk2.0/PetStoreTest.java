

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PetStoreTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PetStoreTest
{
    private Animal dog;
    private Mammal dog1;
    private Mammal cat;
    private Bird bird;
    private Fish fish1;
    private Fish fish2;
    private Bird bird1;
    private PetStore petStore1;

    /**
     * Default constructor for test class PetStoreTest
     */
    public PetStoreTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        dog = new Mammal("Mammal", "Dog", 150, "Max", 2020, 12, 11, 4, 7);
        cat = new Mammal("Mammal","Cat", 75, "Pusur", 2018, 5, 2, 3, 12);
        bird = new Bird("Bird", "Canary", 30, "Poppy", 2015, 6, 10, 20, "Red & Yellow");
        fish1 = new Fish("Fish", "Clownfish", 10, "Julio", 2021, 3, 3, 17, 1, "Fresh water");
        fish2 = new Fish("Fish", "Goldfish", 15, "Captain", 2020, 12, 24, 21, 2, "Salt water");
        bird1 = new Bird("Bird", "Parrot", 25, "Sparrow", 2021, 8, 12, 35, "Red, Green & Blue");
        petStore1 = new PetStore("PetShop", "Prost lassens gate 8");
        petStore1.addAnimal(bird1);
        petStore1.addAnimal(fish2);
        petStore1.addAnimal(fish1);
        petStore1.addAnimal(bird);
        petStore1.addAnimal(cat);
        petStore1.addAnimal(dog);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}

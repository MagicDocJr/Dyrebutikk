

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
    private Mammal mammal1;
    private Bird bird1;
    private Fish fish1;
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
        mammal1 = new Mammal("Dog", 250, "Max", 2021, 2, 11, 4, 7);
        bird1 = new Bird("Bird", 45, "Jeff", 2018, 12, 11, 25, "red & white");
        fish1 = new Fish("GoldFish", 15, "Bob", 2020, 5, 8, 17, 1, "FreshWater");
        petStore1 = new PetStore("PetShop", "Prost Lassens Gate 8");
        petStore1.addAnimal(bird1);
        petStore1.addAnimal(fish1);
        petStore1.addAnimal(mammal1);
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

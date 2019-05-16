import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Student Name: Manpreet Kaur 
 * Student Id:738175
 */

public class SnakeTest {

    private Snake peter;
    private Snake Takis;

    public SnakeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        peter = new Snake("Peter",5, "Tim bits");
        Takis = new Snake("Takis",10, "vegetables");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isHealthy method, of class Snake.
     */
    @Test
    public void testIsHealthy() {
        System.out.println("isHealthy");
        boolean expResult = false;

        boolean result = peter.isHealthy();
        assertEquals(expResult,result);
        System.out.println("peter is healthy " + result);


       
        expResult = true;
        result = Takis.isHealthy();
        assertEquals(expResult,result);
        System.out.println("Takis is healthy " + result);

    }

    /**
     * Test of fitsInCage method, of class Snake.
     */
    @Test
    public void testFitsInCage() {
        System.out.println("fits In Cage");

        int cageLength = 8;
        boolean expResult = true;

       
        boolean result = peter.fitsInCage(cageLength);
        assertEquals(expResult, result);
        System.out.println("Peter fit in cage  " + result);

     
        result = peter.fitsInCage(10);
        assertEquals(false, result);
        System.out.println("Peter fit in cage ? " + result);

       

        result = peter.fitsInCage(11);
        assertEquals(true, result);
        System.out.println("Peter fit in cage ? " + result);
       


       
        cageLength = 70;
        expResult = false;
        result = Takis.fitsInCage(cageLength);
        assertEquals(expResult, result);
        System.out.println("Takis fits in cage " + result);

       
        result = Takis.fitsInCage(30);
        assertEquals(true, result);
        System.out.println("Takis fits in cage "+result);

        

        result = Takis.fitsInCage(120);
        assertEquals(false, result);
        System.out.println("Takis fits in cage " + result);

    }

}

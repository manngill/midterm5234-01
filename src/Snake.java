import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Snake {
	private String name;
	private int length; // the length of the boa, in feet
	private String favoriteFood;

	
	/**
	 * Creates a new Snake object.
	 * @param name			the name of the snake
	 * @param length		length of the snake
	 * @param favoriteFood	what the snake likes to eat
	 */
	
	public Snake(String name, int length, String favoriteFood) {
		this.name = name;
		this.length = length;
		this.favoriteFood = favoriteFood;
	}

	
	/**
	 * Snakes are healthy if they love vegetables
	 * @return true if snake is healthy
	 */
	public boolean isHealthy() {
		return this.favoriteFood.equals("vegetables");
		
		
		ArrayList<Integer> Snake;
		
	
		@Before
		public void setUp() throws Exception {
			// set up the initial values of your test array
			// Creates a new array with (5,10,12) as the contents
			myTestArray = new ArrayList<Integer>(Arrays.asList(5,10,12));
		}

		
		@After
		public void tearDown() throws Exception {
		}
		
		@Test
		public void testIndexOf() {
			
			int index = Snake.indexOf(new Integer(5)); // should return 0
			assertEquals(0, index);
			
			// TC2: indexOf == find the position of something that doesnt exit
			int indexOfDoesNotExist = Snake.indexOf(new Integer(5));
			assertEquals(-1, indexOfDoesNotExist);
			
		}
		
		
		
	}

	
	/**
	 * Checks if snake will fit in a cage 
	 * @return true if snake length < cage length
	 */
	// returns true if the length of this snake is
	// less than the given cage length
	public boolean fitsInCage(int cageLength) {
		return this.length < cageLength;
	}
}


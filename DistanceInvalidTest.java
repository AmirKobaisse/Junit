package locationTest_Junit;
import location.Location;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistanceInvalidTest {
	 Location loc1 = new Location("K1B", 45.4325, -75.5624);
     Location loc2 = new Location("K2B", 45.3679, -75.7888);
     Location loc3 = new Location("K2L", 45.3125, -75.8838);
     Location loc4 = new Location("K1Z", 45.3956, -75.7462);
     Location loc5 = new Location("K1G", 45.4118, -75.6304);
 
    	    double a1 = loc1.distanceTo(loc1);
    	    double a2 = loc1.distanceTo(loc2);
    	    double a3 = loc1.distanceTo(loc3);
    	    double a4 = loc1.distanceTo(loc4);
    	    double a5 = loc1.distanceTo(loc5);
    	    
    	    double b1 = loc2.distanceTo(loc1);
    	    double b2 = loc2.distanceTo(loc2);
    	    double b3 = loc2.distanceTo(loc3);
    	    double b4 = loc2.distanceTo(loc4);
    	    double b5 = loc2.distanceTo(loc5);
    	    
    	    double c1 = loc3.distanceTo(loc1);
    	    double c2 = loc3.distanceTo(loc2);
    	    double c3 = loc3.distanceTo(loc3);
    	    double c4 = loc3.distanceTo(loc4);
    	    double c5 = loc3.distanceTo(loc5);
    	    
    	    double d1 = loc4.distanceTo(loc1);
    	    double d2 = loc4.distanceTo(loc2);
    	    double d3 = loc4.distanceTo(loc3);
    	    double d4 = loc4.distanceTo(loc4);
    	    double d5 = loc4.distanceTo(loc5);
    	    
    	    double e1 = loc5.distanceTo(loc1);
    	    double e2 = loc5.distanceTo(loc2);
    	    double e3 = loc5.distanceTo(loc3);
    	    double e4 = loc5.distanceTo(loc4);
    	    double e5 = loc5.distanceTo(loc5);

    	    //2D array to store the values
    	    double[][] actual = {
    	        {a1, a2, a3, a4, a5},
    	        {b1, b2, b3, b4, b5},
    	        {c1, c2, c3, c4, c5},
    	        {d1, d2, d3, d4, d5},
    	        {e1, e2, e3, e4, e5}
    	    };  
    	    
	   double[][] incorrect = {
	            {0.648, 0.985, 0.643, 0.345, 0.875},
	            {0.783, 0.560, 0.440, 0.023, 0.983},
	            {0.322, 0.430, 0.890, 0.181, 0.988},
	            {0.143, 0.111, 0.001, 0.700, 0.009},
	            {0.065, 0.444, 0.432, 0.617, 0.767}
	        };
	
	@Test
	public void testDistance() {
	    // Loop through the actual array to compare each element with the test array
	    for (int i = 0; i < actual.length; i++) {
	        for (int j = 0; j < actual[i].length; j++) {
	            // Get the expected value from the array
	            double expected = incorrect[i][j];
	            // Get the actual value from the second array
	            double actualValue = actual[i][j];
	            // Assert that the expected value matches the actual value
	            assertEquals(expected, actualValue, 0.001);
	        }
	    }
	}
	}
	 
	
	
package locationtest;

import location.Location;

/**
 * This class demos the Location class by calculating distances between locations.
 */
public class LocationTest {

    public static void main(String[] args) {
        // Test data
        Location[] locations = {
            new Location("K1B", 45.4325, -75.5624),
            new Location("K2B", 45.3679, -75.7888),
            new Location("K2L", 45.3125, -75.8838),
            new Location("K1Z", 45.3956, -75.7462),
            new Location("K1G", 45.4118, -75.6304)
        };

        // Print header row
        System.out.printf("%6s","");
        
        for(int i = 0; i < locations.length; i++) {
        	Location a = locations[i];
        	System.out.printf("%6s",a.getPostalCode());
        }
        System.out.println();
        // Calculate and display distances
        for (int i = 0; i < locations.length; i++) {
            System.out.printf("%6s", locations[i].getPostalCode());
            for (int j = 0; j < locations.length; j++) {
                double distance = locations[i].distanceTo(locations[j]);
                System.out.printf("%6.3f", distance);
                }
            System.out.println("");
        }
    }
}

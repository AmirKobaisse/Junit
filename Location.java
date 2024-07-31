package location;

/**
 * Author: Amir Kobaisse
 * Course: CST8284
 * Term: Spring2024
 * Assignment: Assignment 1
 * Date: Date of the final version of this source code
 * Purpose: Represents a location identified by its postal code prefix and includes a method to calculate distance between 2 locations.
 */


/**
 * This class represents a location identified by its postal code, latitude, and longitude.
 */
public class Location {
    private String postalCode;
    private double latitude;
    private double longitude;

    /**
     * Constructor to initialize a Location object with postal code, latitude, and longitude.
     *
     * @param postalCode The postal code of the location.
     * @param latitude The latitude of the location.
     * @param longitude The longitude of the location.
     */
    public Location(String postalCode, double latitude, double longitude) {
        this.postalCode = postalCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Gets the postal code of this location.
     *
     * @return The postal code.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Gets the latitude of this location.
     *
     * @return The latitude.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the longitude of this location.
     *
     * @return The longitude.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Calculate the distance between this location and another location using the 2D distance formula.
     *
     * @param other The other location to which the distance is calculated.
     * @return The distance between the two locations.
     */
    public double distanceTo(Location other) {
        double xDistance = other.getLatitude() - this.latitude;
        double yDistance = other.getLongitude() - this.longitude;
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }
}
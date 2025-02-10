package com.example.project.Airport;
import java.util.ArrayList;

public class Airport  {
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights) {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights() {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue() {
        /* to be implemented in part (a) */
        double revenue = 0;
        for(Flight flight : allFlights)
        {
            if(flight.getNumPassengers()> flight.getCapacity())
            {
                revenue+=flight.getCapacity()* flight.getPrice();
            }
            else
            {
                revenue+=flight.getNumPassengers()* flight.getPrice();
            }
        }
        return revenue;
    }

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights() {
        int num = 0;
        ArrayList<Flight> remove = new ArrayList<>();
        for (Flight flight : allFlights)
        {
            if(flight.getNumPassengers() < 0.2 * flight.getCapacity())
            {
                num += flight.getNumPassengers();
                remove.add(flight);
            }
        }
        allFlights.removeAll(remove);
        return num;
    }
}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane;
    Flight flight;
    FlightManager flightManager;
    Passenger passenger;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane);
        flightManager = new FlightManager(flight);
        passenger = new Passenger("John", 3);

    }

    @Test
    public void canGetBaggageWeightForPassenger(){
        assertEquals(6, flightManager.baggageWeightForPassenger());
    }

    @Test
    public void canGetBaggageWeightUsed(){
        flight.addPassenger(passenger);
        assertEquals(6, flightManager.baggageWeightUsage());
    }

    @Test
    public void getTotalRemainingBaggageAllowance(){
        flight.addPassenger(passenger);
        assertEquals(2494, flightManager.totalRemainingBaggageAllowance());
    }

}

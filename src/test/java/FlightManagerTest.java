import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane;
    Flight flight;
    FlightManager flightManager;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane);
        flightManager = new FlightManager(flight);


    }
    @Test
     public void canGetBaggageWeightForPassenger(){

        assertEquals(6, flightManager.baggageWeightForPassenger());
    }

}

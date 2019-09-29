import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightTest {


     Plane plane;
     Flight flight;
     Passenger passenger;

     @Before
     public void setUp(){
         plane = new Plane(PlaneType.BOEING747);
         flight = new Flight(plane);
         passenger = new Passenger("John", 3, flight);
     }
     @Test
     public void canGetAvailableSeats(){


         assertEquals(400, flight.availableSeats());
     }
     @Test
     public void canAddPassenger(){
         assertNotNull(passenger);
         flight.addPassenger(passenger);


         assertEquals(1, flight.passengerCount());

     }

}









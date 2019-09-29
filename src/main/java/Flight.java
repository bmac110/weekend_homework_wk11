import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public int availableSeats(){
       return this.plane.getCapacity() - this.passengerCount();
    }

    public void addPassenger(Passenger passenger) {
        if(this.availableSeats() > 0) {

            this.passengers.add(passenger);
        }
    }

    public int passengerCount() {
        return this.passengers.size();
    }
    public int getCapacity(){
        return this.plane.getCapacity();
    }
    public int getTotalWeight(){
        return this.plane.getTotalWeight();
    }
}




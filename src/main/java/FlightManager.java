import java.util.ArrayList;

public class FlightManager {


    private Flight flight;
    private Passenger passenger;
//    private ArrayList<Passenger> passengers;


    public FlightManager(Flight flight, Passenger passenger){
//        this.passengers = new ArrayList<Passenger>();
        this.passenger = passenger;
        this.flight = flight;
    }

    public int baggageWeightForPassenger(){
        int totalBaggageAllowance = flight.getTotalWeight() / 2;
        return totalBaggageAllowance / flight.getCapacity();
    }

    public int baggageWeightUsage(){
        int totalWeight = baggageWeightForPassenger() * passenger.numOfBags();
        return totalWeight * flight.passengerCount();

    }

    public int totalBaggageAllowance(){
        return flight.getTotalWeight() / 2;
    }

    public int totalRemainingBaggageAllowance(){
        return this.totalBaggageAllowance() - this.baggageWeightUsage();
    }
}

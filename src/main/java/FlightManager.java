public class FlightManager {


    private Flight flight;


    public FlightManager(Flight flight){

        this.flight = flight;
    }

    public int baggageWeightForPassenger(){
        int totalBaggageAllowance = flight.getTotalWeight() / 2;
        return totalBaggageAllowance / flight.getCapacity();
    }

    public int baggageWeightUsage(){
        return this.baggageWeightForPassenger() * flight.passengerCount();
    }

    public int totalBaggageAllowance(){
        return flight.getTotalWeight() / 2;
    }

    public int totalRemainingBaggageAllowance(){
        return this.totalBaggageAllowance() - this.baggageWeightUsage();
    }
}

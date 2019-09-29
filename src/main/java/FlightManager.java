public class FlightManager {


    private Flight flight;


    public FlightManager(Flight flight){

        this.flight = flight;
    }

    public int baggageWeightForPassenger(){
        int totalBaggageAllowance = flight.getTotalWeight() / 2;
        return totalBaggageAllowance / flight.getCapacity();
    }
}

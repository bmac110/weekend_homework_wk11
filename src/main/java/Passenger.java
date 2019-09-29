public class Passenger {

    private String name;
    private int bags;
    private Flight flight;

    public Passenger(String name, int bags, Flight flight){
        this.name =  name;
        this.bags =  bags;
        this.flight = flight;
    }

    public int numOfBags(){
        return this.bags;
    }
}

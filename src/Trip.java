public class Trip implements Comparable<Trip>{

    String destination;
    String fromCity;
    Double price;
    String type;

    public Trip(String destination, String fromCity, Double price, String type) {
        this.destination = destination;
        this.fromCity = fromCity;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "destination='" + destination + '\'' +
                ", fromCity='" + fromCity + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Trip o){
        return this.price.compareTo(o.price);
    }
}
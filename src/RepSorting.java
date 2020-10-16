import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RepSorting {

    static ArrayList<Trip> trips = new ArrayList<>();

    public static void main(String[] args) {

        Trip t1 = new Trip("Stockholm", "Tokyo", 5000.0, "Business");
        Trip t2 = new Trip("Madrid", "London", 4000.0, "Tour");
        Trip t3 = new Trip("Oslo", "Nerja", 7000.0, "Ekonomi");
        Trip t4 = new Trip("Rom", "New York", 6500.0, "Business");

        trips.add(t1);
        trips.add(t2);
        trips.add(t3);
        trips.add(t4);

        Predicate<Trip> cheaperThen5000 = trip -> trip.price < 5000;
        Predicate<Trip> destinationMadrid = trip -> trip.destination.equalsIgnoreCase("Madrid");
        Comparator<Trip> sortBypriceDecending = ((o1, o2) -> o2.price.compareTo(o1.price));
        Consumer<Trip> printElement = System.out::println;

        trips.stream()
                .sorted(sortBypriceDecending)
                .filter(cheaperThen5000)
                .filter(destinationMadrid)
                .forEach(printElement);
    }
}
import java.util.ArrayList;
import java.util.Collections;

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

        System.out.println("\nSorted by price ascending");

        trips.sort(null);

        for (Trip p : trips){
            System.out.println(p);
        }

        System.out.println("\nSorted by price descending");
        Collections.reverse(trips);

        for (Trip p : trips){
            System.out.println(p);
        }

        System.out.println("\nSorted by destination ascending");
        trips.sort(new SortByDestinationAscending());

        for (Trip p : trips){
            System.out.println(p);
        }

        System.out.println("\nSorted by destination descending");
        Collections.reverse(trips);

        for (Trip p : trips){
            System.out.println(p);
        }

        System.out.println("\nSorted by fromCity ascending");
        trips.sort(new SortByFromCityAscending());

        for (Trip p : trips){
            System.out.println(p);
        }

        System.out.println("\nSorted by fromCity descending");
        Collections.reverse(trips);

        for (Trip p : trips){
            System.out.println(p);
        }

        System.out.println("\nSorted by type ascending");
        trips.sort(new SortByTypeAscending());

        for (Trip p : trips){
            System.out.println(p);
        }

        System.out.println("\nSorted by type descending");
        Collections.reverse(trips);

        for (Trip p : trips){
            System.out.println(p);
        }
    }
}

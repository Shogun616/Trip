import java.util.Comparator;

public class SortByDestinationAscending implements Comparator<Trip>{

    @Override
    public int compare(Trip t1, Trip t2){
        return t1.destination.compareTo(t2.destination);
    }
}
